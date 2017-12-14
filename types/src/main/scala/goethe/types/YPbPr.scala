package goethe.types


case class YPbPr(
  y: Double,
  pb: Double,
  pr: Double
) extends Color

object YPbPr {
  def apply(y: Double, pb: Double, pr: Double): YPbPr =
    new YPbPr(y, pb, pr)
}
