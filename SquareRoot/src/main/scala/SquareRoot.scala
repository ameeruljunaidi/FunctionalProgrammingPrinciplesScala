import scala.annotation.tailrec

def sqrt(x: Double): Double = sqrtIter(1.0, x)

@tailrec
def sqrtIter(guess: Double, x: Double): Double =
  if isGoodEnough(guess, x) then guess
  else sqrtIter(improve(guess, x), x)

// isGoodEnough is not very precise for small numbers and can lead to non-termination for very large numbers

def isGoodEnough(guess: Double, x: Double): Boolean =
  (guess * guess - x).abs < 0.001

def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2
