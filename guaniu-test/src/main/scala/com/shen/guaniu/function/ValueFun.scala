package com.shen.guaniu.function

import scala.math._
/**
 * Created by shenge on 15/12/9.
 *
 * 作为值的函数
 */
object ValueFun {

  val num = 0

  // ceil是scala和java内置的一个类似四舍五入的内置函数。
  // ceil后的 _ 意味着你确实指的是ceil这个函数，而不是碰巧忘了传参数，如果去掉 _ 会报错
  // 从技术上讲，_ 将ceil方法转换成了函数，scala中，你无法直接操纵方法，而只能直接操纵函数。
  val fun = ceil _


}
