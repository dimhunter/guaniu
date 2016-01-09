package com.shen.guaniu.basic

import java.util.Date


/**
 * Created by shenluguo on 2015/6/30.
 * 元组测试
 *
 * 创建元组非常简单，将值放入一组圆括号内，就好象调用一个方法调用一样。
 * 提取这些值只需要调用 “_n” 方法，其中 n 表示相关的元组元素的位置参数： _1 表示第一位， _2 表示第二位，依此类推。
 */
object TupleTest {

  def main(args: Array[String]) {

    val date = Date.parse("2015/6/30")

    val tuple = ("aaa","bbb", 123, date)

    println(tuple._1)
    println(tuple._3)
    println(tuple._4)
    println(tuple._2)

    println("============")

    val tuple2 =(1,2,3.14,"Rocky","Spark","Flink")
    val third = tuple2._3
    val (first,second,thirda,fourth,fifth,sixth) = tuple2
    val (f, s, _, _, _,_) = tuple2
    println(fifth)
    println(s)

    //partition返回2个集合，一个是大写的所有元素，一个是余下的所有元素
    println("Rocky Spark".partition(_.isUpper))

    //拉链操作，使用元祖愿意之一是把多个值绑在一起，通常用zip方法来完成。
    //就是把2个数组的每个元素组成个新的元素。
    val symbols = Array("[", "-", "]")
    val counts = Array(2,5,2)
    val pairs = symbols.zip(counts)
    println(pairs.toBuffer)
    //???????
    for ((x,y) <- pairs) print(x*y)

  }

}
