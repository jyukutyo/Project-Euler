/**
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  *
  * Find the sum of all the primes below two million.
  */
object Problem10 extends App {

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(
    i => {
      ps.takeWhile(j => { j * j <= i }).forall(i % _ > 0)
    }
  )

  val result = ps.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
  // val result = ps.view.takeWhile(_ < 2000000).sum はオーバーフローするので正しい解が出ない。 sumはストリームの型パラメータと同じ型が結果の型となるため。
  // map(_.toLong)するとsumでもよい。

  Console.println(result)
}
