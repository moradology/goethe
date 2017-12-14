package goethe.types


case class CMYK(
  cyan: Double,
  magenta: Double,
  yellow: Double,
  key: Double
) extends Color

object CMYK {
  def apply(cyan: Double, magenta: Double, yellow: Double, key: Double) =
    new CMYK(cyan, magenta, yellow, key)
}

