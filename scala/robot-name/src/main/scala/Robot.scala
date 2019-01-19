import scala.collection.immutable.Stream

class Robot {
  val random = new scala.util.Random(System.currentTimeMillis())
  val alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val num = "0123456789"

  var name : String = genName()

  def reset(): Unit = {
    name = genName()
  }

  def genName():String = {
    alphanumeric(alpha).take(2).mkString + alphanumeric(num).take(3).mkString
  }


  def alphanumeric(chars: CharSequence): Stream[Char] = {
    def nextAlphaNum: Char = {
      chars charAt (random nextInt chars.length)
    }
    Stream continually nextAlphaNum
  }
}