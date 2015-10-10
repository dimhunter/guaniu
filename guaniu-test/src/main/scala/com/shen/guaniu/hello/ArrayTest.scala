package com.shen.guaniu.hello

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
  }
}
