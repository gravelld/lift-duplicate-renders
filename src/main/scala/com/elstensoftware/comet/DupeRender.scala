package com.elstensoftware.comet





import net.liftweb._
import common._
import http._
import util._

class DupeRender extends CometActor {
	
 	override def defaultPrefix = Full("dupe render") 

	def render = {
 	  
 	  ".content *" #> ("render() name:" + name)

 	}

}

object DupeRender {
  
}