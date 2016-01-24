package com.shen.guaniu.pattern_match

abstract class Item
case class Book(description: String, price: Double) extends Item
case class Bundle(description: String, price: Double, items: Item*) extends Item


/**
 * 匹配嵌套结构
 */
object Pattern_Match_Case_Class_Nested {

  def main(args: Array[String]) {
    def caseclass_nested(item: Item) =  item match {
				//@表示将嵌套的值绑到变量。这里将匹配到的第三个参数Book绑定到art。
			case Bundle(_, _, art @ Book(_, _), rest @ _*) => println(art.description + " : " + art.price)
//		  case Bundle(_, _, Book(descr, _), _*) => println("The first description is :" + descr)
		  case _ => println("Oops!")
		}

	  caseclass_nested(Bundle(
					"1111 Special's", 30.0, Book("Scala for the Spark Developer", 69.95), Bundle("Hadoop", 40.0,
							Book("Hive", 79.95),
							Book("HBase", 32.95)
						)
     	)
		)
     caseclass_nested(Bundle("1212 Special's", 35.0, Book("Spark for the Impatient", 39.95)
		 		)
		 )

  }

}