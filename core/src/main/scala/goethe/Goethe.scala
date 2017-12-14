package goethe

import goethe.types._


object Goethe {
  def isHex(str: String) = ???

  def apply(str: String) = str match {
    case hex if isHex(hex) => ???
    case _ => ???
  }

  def apply(color: Color) = ???
}
