package goethe.types


case class HSL(
  hue: Double,
  saturation: Double,
  lightness: Double
) extends Color

object HSL {
  def apply(hue: Double, saturation: Double, lightness: Double): HSL =
    new HSL(hue, saturation, lightness)
}

