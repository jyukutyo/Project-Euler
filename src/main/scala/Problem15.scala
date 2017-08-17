/**
  * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
  *
  * How many such routes are there through a 20×20 grid?
  *
  * 2 * 2 -> 6
  * 3 * 3 -> 72
  */
object Problem15 extends App {

  def routes(length: Long): BigInt = {
    if (length == 1) return BigInt(2)

    val countToGoal = length * 2
    (0L until length).map(countToGoal - _).map(BigInt(_)).product / (1L to length).map(BigInt(_)).product
  }

  println(routes(20))

}
