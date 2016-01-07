package com.shen.guaniu.basic

import scala.collection.mutable.ArrayBuffer

/**
 * Created by shenluguo on 2015/10/10.
 */
object ArrayTest {
  def main(args: Array[String]) {
    //10个整数的数组，所有元素初始化为0
    val nums = new Array[Int](10)
    //10个字符串的数组，所有元素初始化为null
    val strs = new Array[String](10)
    //长度为2的Array[String]，类型String是根据右边值推断出来的，已提供初始值就不需要new了。
    val s = Array("hello","scala","aaa")
    //使用(),而不是[]来访问元素。
    println("s数组的第1个元素是："+s(0))


    for (i <- 0 until s.length){
      println(i + " = "+ s(i))
    }

    for(ele <- s){
      println(ele)
    }

    //TODO 可变数组，尚未整理 ？？？
    val b = ArrayBuffer[Int]()
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array(8, 13, 21)
    b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
    b.remove(2)
    b.remove(2, 3)
    b.toArray



    val c = Array(2, 3, 5, 7, 11)
    val result = for (elem <- c) yield 2 * elem
    for (elem <- c if elem % 2 == 0) yield 2 * elem
    c.filter(_ % 2 == 0).map(2 * _)

    Array(1, 7, 2, 9).sum
    ArrayBuffer("Mary", "had", "a", "little", "lamb").max

    val d = ArrayBuffer(1, 7, 2, 9)
    val bSorted = d.sorted

    val e = Array(1, 7, 2, 9)
    scala.util.Sorting.quickSort(e)

    e.mkString(" and ")
    d.mkString("<", ",", ">")

    val matrix = Array.ofDim[Double](3, 4)
    matrix(2)(1) = 42
    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i + 1)

  }
}
