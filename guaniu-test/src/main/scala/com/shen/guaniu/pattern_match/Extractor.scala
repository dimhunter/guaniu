package com.shen.guaniu.pattern_match

/**
 * 提取器，书上11.8章节
 * 所谓提取器就是一个带有unapply方法的对象，可以当做伴生对象apply方法的反向操作
 * apply是构造对象，unapply是从对象中提取值。
 */
object Extractor {

  def main(args: Array[String]){
    
    def match_array(arr : Any) = arr match {
	  case Array(0) => println("Array:" + "0") 
	  case Array(x, y) => println("Array:" + x + " " +y)  
	  case Array(0, _*) => println("Array:" + "0 ...")  
	  case _ => println("something else")
	}
    
    match_array(Array(0))
    match_array(Array(0,1))
    match_array(Array(0,1,2,3,4,5))
    
    val pattern = "([0-9]+) ([a-z]+)".r
		"20150628 hadoop" match {
		  case pattern(num, item) => println(num + " : " + item)
		}
   
      
  }

}