object Problem1 extends App {
  val answer = (1 until 1000).view.filter(x => { x % 3 == 0 || x % 5 == 0 }).sum
  Console.println(answer)
}