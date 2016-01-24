package com.shen.guaniu.pattern_match

object Hello_Pattern_Match {

  def main(args: Array[String]) {
    val data =2
    data match {
	    case 1 => println("First")
	    case 2 => println("Second")
				//匹配所有其他，类似default。
	    case _ => println("Not Known Number")
	  }

		//模式匹配中的守卫
    val result = data match {
	  case i if i == 1 => "The First"
	  case number if number ==2 => "The Second " + number
	  case _ => "Not Known Number"
	  }
    println(result)  
         
    "Spark !" foreach { c => println (
	    c match {
	      case ' ' => "space"
					//模式匹配中的变量。
					//如果case后跟一个变量名，那么匹配的表达式会赋值给这个变量
					//可以将case _ 看做这个特性的一个特殊情况，只不过变量名是 _ 罢了。
	      case ch => "Char: " + ch
	    }
	    )}
    
    
    
  }

}