package com.blueskiron.root

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello Scala!" )
    println("concat arguments = " + foo(args))
  }

}
