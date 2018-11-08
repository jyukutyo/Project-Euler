
object Problem3 extends App {
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(
    i => {
      // 素数だけのリストを作る。jはiの平方根より小さい数で、iを割り切ることができない数である。
      ps.takeWhile(j => { j * j <= i }).forall(i % _ > 0)
    }
  )

  val n = 600851475143L

  // 素因数の素朴試し割り法では、割る数の最大値はその数の平方根まででよい。
  // 割る数の最大値で割ったとき、商は必ず素数になる。
  val limit = math.sqrt(n)

  val r = ps.view.takeWhile(_ < limit).filter(n % _ == 0).last
}
