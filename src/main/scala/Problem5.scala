object Problem5 extends App {
  Range(20, Int.MaxValue)
    .find(n => Range(2, 21).forall(n % _ == 0)).get
}
