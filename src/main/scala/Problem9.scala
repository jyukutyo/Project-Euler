import java.text.DecimalFormat

object Problem9 extends App {

  for (a <- 1 to 1000; b <- 1 to 1000) yield {
    val total = math.pow(a, 2) + math.pow(b, 2)

    val c = math.sqrt(total).floor
    val t = c * c

    if (t.equals(total) && (a + b + c).toInt.equals(1000)) {
      val formatter = new DecimalFormat("#")
      Console.println(formatter.format(a * b * c))
    }
  }
}