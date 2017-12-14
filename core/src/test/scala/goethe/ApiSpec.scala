package goethe

import goethe.types._


object ApiSpec {

  Goethe("#D4F880").darken().hex() should be ("#9BC04B")

  val scale = chroma.scale(['white', 'red'])
  scale(0.5).hex() should be ("#FF7F7F")

  val labScale = chroma.scale(['white', 'red']).mode('lab')
  labScale(0.5).hex() should be ("???")

  val quantileScale = chroma.scale(RdYlBu).domain(myValues, 7, 'quantiles')

  val logScale = chroma.scale(['lightyellow', 'navy']).domain([1, 100000], 7, 'log')
}
