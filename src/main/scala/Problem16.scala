import java.math.MathContext

/**
  * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
  *
  * What is the sum of the digits of the number 2^1000?
  */
object Problem16 extends App {

  println(BigDecimal(2, MathContext.UNLIMITED).pow(1000).bigDecimal.toPlainString.map(_.asDigit).sum)

}
