package com.shen.guaniu.basic

/**
 * Created by shenge on 15/12/6.
 */
object ForTest {

  def main(args: Array[String]) {
    //1. 基本for循环
    // to 和 until 两种
    for(i <- 1 to 10){
      print(i + " ," )
    }
    println()

    val s = "hello"
    for(i <- 0 until s.length){
      println(s(i))
    }

    //2. 多个 变量<-表达式 形式的生成器，分号隔开
    for(i <- 1 to 3 ; j <- 1 to 3){
      print((10 * i + j ) + " ,")
    }
    println
    //带守卫的生成器的多生成器for循环，守卫的意思就是if开头的boolean表达式，注意if之前是没有分号的
    for(i <- 1 to 3 ; j <- 1 to 3 if i != j){
      print((10 * i + j ) + " ,")
    }
    println
    //3. for推导式 ，如果for循环的循环体以 yield开始，则该循环会构造出一个集合，每次迭代生产集合中的
    //一个值，这类循环就叫for推导式。生产的集合与第一个生成器式类型兼容，注意是第一个，注意yield紧邻for结束的括号，中间不能大括号开始。
    //书20页，可先暂不掌握，似乎不重要
    for(c <- "hello" ; i <- 0 to 1)
      yield (c + i).toChar


  }

}
