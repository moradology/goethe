package goethe.types


case class LCH(
  lightness: Double,
  chroma: Double,
  hue: Double
) extends Color

object LCH {
  def apply(lightness: Double, chroma: Double, hue: Double): LCH =
    new LCH(lightness, chroma, hue)
}

