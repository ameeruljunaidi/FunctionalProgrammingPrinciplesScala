
@main def run(): Unit = {
  println("sqrt(2) " + sqrt(2))
  println("sqrt(0.001) " + sqrt(0.001))
  println("sqrt(0.1e-20) " + sqrt(0.1e-20))
  println("sqrt(0.1e20) " + sqrt(0.1e20))
  println("sqrt(0.1e50) " + sqrt(0.1e50))
}