package com.shen.guaniu.function

import scala.math._

/**
 * 高阶函数
 */
object HigherOrderFun {

  def main(args: Array[String]){
    
    (1 to 9).map("*" * _).foreach(println _)
    (1 to 9).filter(_ % 2 == 0) .foreach(println)
    println((1 to 9).reduceLeft(_ * _))
    "Spark is the most exciting thing happening in big data today".split(" ").
    	sortWith(_.length < _.length).foreach(println)

    
    val fun = ceil _
    val num = 3.14
    println(fun(num) )
   Array(3.14, 1.42, 2.0).map(fun).foreach(println)
    
    //不同的写法，函数参数可以是圆括号，也可以是花括号。
    Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
    Array(3.14, 1.42, 2.0).map{ (x: Double) => 3 * x }

    //以函数为参数的函数，(参数类型) => 结果类型。
    //high_order_functions的参数就是一个：参数类型为Double，结果为Double的函数。
    def high_order_functions(f: (Double) => Double) = f(0.25)
    println("0.25 求整 = " + high_order_functions(ceil _))
    println("0.25 求平方根 = " + high_order_functions(sqrt _))


    //参数(类型)推断，scala会根据实际传入的参数值类型，推断出参数类型，high_order_functions是f(0.25),所以会推断出是Double类型
    println(high_order_functions((x: Double) => 3 * x))
    //类型可以推断出，可以简写，所以可以把Double去掉
    high_order_functions((x) => 3 * x)
    //对于只有一个参数的函数，可以省去参数外围的()
    high_order_functions(x => 3 * x)
    //如果参数在 => 右侧只出现一次，可以用_替换掉它，这可以说是终极版本了。
    println(high_order_functions(3 * _))
    
    val fun2 = 3 * (_: Double) 
    val fun3: (Double) => Double = 3 * _ 


  }

}