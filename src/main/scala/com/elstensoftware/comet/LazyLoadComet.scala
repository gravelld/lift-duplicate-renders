package com.elstensoftware.comet





import net.liftweb._
import common._
import http._
import util._
import Helpers._

class LazyLoadComet extends CometActor {
	
 	override def defaultPrefix = Full("lazyload") 

 	var counter=1
 	
	def render = {
 	  "*" #> ("render: " + counter)

 	}
 	
 	def schedulePing = Schedule.schedule(() => this ! Increment(), 1 seconds)

 	schedulePing
 	
 	case class Increment()
 	
  override def lowPriority: PartialFunction[Any, Unit] = {
    case Increment() => {
      counter = counter+1
      reRender(true)
      schedulePing
    }
 	} 	
}

object LazyLoadComet {
  
}