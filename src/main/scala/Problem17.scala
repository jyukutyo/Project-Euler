
/**
  * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
  *
  * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
  *
  * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
  */
object Problem17 extends App {

  def countLetters(num: Int): Int = {
    val numberWithDigit = num.toString.toCharArray.map(_.asDigit).reverse.zipWithIndex.reverse

    val word = numberWithDigit.map {
      case (n, 3) => toWord(n) + "thousand"
      case (0, 2) => ""
      case (n, 2) if n > 0 => toWord(n) + "hundred"
      case (n, 1) => {
        val word = n match {
          case 8 => "eighty"
          case 5 => "fifty"
          case 4 => "forty"
          case 3 => "thirty"
          case 2 => "twenty"
          case 1 => {
            numberWithDigit.last._1 match {
              case 0 => "ten"
              case 1 => "eleven"
              case 2 => "twelve"
              case 3 => "thirteen"
              case 5 => "fifteen"
              case 8 => "eighteen"
              case n => toWord(n) + "teen"
            }

          }
          case 0 => ""
          case n => toWord(n) + "ty"
        }
        if (num > 100 && !(numberWithDigit.contains((0,0)) && numberWithDigit.contains((0,1)))) "and" + word else word
      }
      case (n, 0) => {
        if (numberWithDigit.contains((1,1))) {
          ""
        }
        else
          toWord(n)
      }
    }.reduce(_ + _)

    println(word)

    word.length
  }

  def toWord(num: Int): String = {
    num match {
      case 0 => ""
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
    }
  }

  println(countLetters(342))
  println(countLetters(115))

  println((1 to 1000).map(countLetters(_)).sum)

}
