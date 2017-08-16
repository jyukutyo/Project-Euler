object Problem7 extends App {

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(
    i => {
      // 素数だけのリストを作る。jはiの平方根より小さい数で、iが割り切れる数である。
      ps.takeWhile(j => { j * j <= i }).forall(i % _ > 0)
    }
  )

  Console.println(ps.take(10001).last)

}