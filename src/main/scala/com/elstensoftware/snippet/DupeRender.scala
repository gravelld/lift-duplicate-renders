package com.elstensoftware.snippet

import net.liftweb._
import common._
import util._ 
import util.Helpers._

object DupeRender {
  
  private def generateName = Helpers.nextFuncName 
  
  def render = "^ [data-lift]" #> s"comet?type=DupeRender"//;name=${generateName}"
}