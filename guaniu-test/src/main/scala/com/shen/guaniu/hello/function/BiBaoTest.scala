package com.shen.guaniu.hello.function

/**
 * 闭包测试？？？？例子不懂
 * Created by shenge on 15/10/15.
 */
object BiBaoTest {

  def mulBy(factor:Double) = (x:Double) => factor * x

  def main(args: Array[String]) {
    val triple = mulBy(3)
    val half = mulBy(0.5)

    println(triple+"=="+half)

    println(triple(14) + " -- " + half(14))
  }

}
