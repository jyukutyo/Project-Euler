object Problem6 extends App {

  val numbers = 1 to 100

  def square(n: Int) = n * n

  val r = square(numbers.sum) - numbers.map(square).sum

  Console.println(r)

}