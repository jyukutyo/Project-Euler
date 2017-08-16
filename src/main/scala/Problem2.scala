object Problem2 extends App {
  def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)

  val answer = fibFrom(1, 2).takeWhile( _ < 4000000).filter(_ % 2 == 0).sum
  Console.println(answer)

}