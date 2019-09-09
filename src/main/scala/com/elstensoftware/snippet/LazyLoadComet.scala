package com.elstensoftware.snippet

import net.liftweb._
import common._
import util._ 
import util.Helpers._
import net.liftweb.builtin.snippet.LazyLoad
import net.liftweb.http.js.JsCmds.Replace

object LazyLoadComet {
  
  private def generateName = Helpers.nextFuncName 
  
  def cometNs = <div data-lift="comet?type=LazyLoadComet"/>
  def render = "*" #> {
    LazyLoad.render(Replace(_, cometNs))    
  }
}