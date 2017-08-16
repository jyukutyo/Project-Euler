
object Problem4 extends App {
  val maltiplicativeResults = 1 to 999 flatMap(i => 1 to 999 map(_ * i))

  val answer = maltiplicativeResults.filter({i =>
    if (i.toString.length % 2 != 0) {
      false
    }
    i.toString.reverse == i.toString
  })

  Console.print(answer.max)
}
