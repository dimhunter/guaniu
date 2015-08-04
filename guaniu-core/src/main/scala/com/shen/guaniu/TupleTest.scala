package com.shen.guaniu

import java.util.Date


/**
 * Created by shenluguo on 2015/6/30.
 * 元组测试
 *
 * 创建元组非常简单，将值放入一组圆括号内，就好象调用一个方法调用一样。
 * 提取这些值只需要调用 “_n” 方法，其中 n 表示相关的元组元素的位置参数： _1 表示第一位， _2 表示第二位，依此类推。
 */
class TupleTest {

  def main(args: Array[String]) {

    val date = Date.parse("2015/6/30")

    val tuple = ("aaa","bbb", 123, date)

    println(tuple._1)
    println(tuple._3)
    println(tuple._4)
    println(tuple._2)

  }


}
