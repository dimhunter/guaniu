package com.shen.guaniu.function

/**
 * 闭包测试？？？？例子不懂
 * Created by shenge on 15/10/15.
 */
object BiBaoFun {

  def mulBy(factor:Double) = (x:Double) => factor * x

  def main(args: Array[String]) {
    val triple = mulBy(3)
    val half = mulBy(0.5)

    println(triple+"=="+half)

    println(triple(14) + " -- " + half(14))


    val data = List(1, 2, 3, 4, 5, 6)
    var sum = 0
    data.foreach(sum += _)
    println(sum)

    def add(more: Int) = (x: Int) => x + more
    val a = add(1)
    val b = add(9999)
    println(a(10))
    println(b(10))
  }

}
