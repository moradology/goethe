package goethe.types


case class LAB(
  lightness: Double,
  a: Double,
  b: Double
) extends Color

object LAB {
  def apply(lightness: Double, a: Double, b: Double): LAB =
    new LAB(lightness, a, b)
}

