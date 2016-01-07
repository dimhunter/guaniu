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
    val a = Array("hello","scala","aaa")
    //使用(),而不是[]来访问元素。
    println("s数组的第1个元素是："+a(0))

    for (i <- 0 until a.length){
      println(i + " = "+ a(i))
    }

    for(ele <- a){
      println(ele)
    }

    //在变长数组的尾端 添加或移除元素是高效的。但是 insert 和 remove 这样在指定位置添加或移除是不高效的 ！！！
    //变长数组，类似java的Arraylist, ArrayBuffer[Int]()表示一个空的数组缓冲，准备存放整数。
    val b = ArrayBuffer[Int]() // 或 val bb = ArrayBuffer[Int]
    // += 符号表示在尾端添加元素。
    b += 1
    println(b)
    // 在尾端添加多个元素，用括号包起来
    b += (1, 2, 3, 5)
    println(b)
    // ++= 操作符可追加任何集合。
    b ++= Array(8, 13, 21)
    println(b)
    // trimEnd 移除最后几个元素
    b.trimEnd(5)
    println(b)
    // insert，第一个参数是下标，从0开始。后边参数是要插入的元素，旧元素依次后移
    b.insert(2, 6)
    println(b)
    b.insert(2, 7, 8, 9)
    println(b)
    // remove,第一个参数是下标，第二个参数是要移除几个元素，要移除的元素个数。
    b.remove(2)
    println(b)
    b.remove(2, 3)
    println(b)
    // ArrayBuffer 转换为不可变的 Array，用方法 toArray；反之，Array转换为可变的ArrayBuffer，用 toBuffer
    b.toArray
    nums.toBuffer


    // TODO 未整理 ！！！
    val c = Array(2, 3, 5, 7, 11)
    val result = for (elem <- c) yield 2 * elem
    println(result + " == "+ result.toBuffer)
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
