package com.shen.guaniu.pattern_match

/**
 * Option 就是一个sealed密封类修饰的样例类，看Option源码，就能看到sealed。
 * 表示那种可能存在，也可能不存在的值。Some存在，None不存在。
 */
object Option_Internal {

  def main(args: Array[String]){
    val scores = Map("Alice" -> 99, "Spark" -> 100)
    
    scores.get("Spark") match {
	  case Some(score) => println(score)
	  case None => println("No score")
	}
       
    
  }

}