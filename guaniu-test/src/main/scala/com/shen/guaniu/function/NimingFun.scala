package com.shen.guaniu.function

/**
 * Created by shenge on 15/10/15.
 *
 * 匿名函数 用 => 符号来定义，代替了函数名和等号
 * 格式 ： (参数列表) => 表达式
 *
 */
object NimingFun {

  //scala中，不需要给每个函数命名，这就是个匿名函数，该函数将传给他的参数乘3
  (x:Double) => 3*x

  //也可以将函数存到变量中，这就跟用def定义是一样的。def cheng4(x:Double) = 4*x
  val cheng4 = (x:Double) => 4*x


  //也可以将匿名函数直接传递给另一个函数，这里告诉map方法，将每个元素乘2
  Array(1,2,5).map((x:Int) => 2*x)

}
