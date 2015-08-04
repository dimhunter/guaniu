package com.shen.guaniu.hello

/**
 * Created by shenluguo on 2015/7/30.
 */
object HelloScala {

  def main(args: Array[String]) {
    println("hello scala")
    println("args = " + args);
    for(arg <- args) println(arg)
  }

}
