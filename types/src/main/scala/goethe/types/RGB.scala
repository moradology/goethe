package goethe.types


case class RGB(
  red: Int,
  green: Int,
  blue: Int
) extends Color

object RGB {
  def apply(red: Int, green: Int, blue: Int): RGB =
    new RGB(red, green, blue)
}
