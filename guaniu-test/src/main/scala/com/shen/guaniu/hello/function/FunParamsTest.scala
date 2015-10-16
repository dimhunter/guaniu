package com.shen.guaniu.hello.function

/**
 * Created by shenge on 15/10/16.
 */
object FunParamsTest {

  //带有默认参数的函数，left参数默认 "<<", right 默认值 ">>"
  def aaa(str : String, left : String=" <<< ", right: String = " >>> ") ={
    println(left + str + right)
  }

  //变长参数,可以用任意多的参数来调用该函数
  def sum(num : Int*) = {
    var result = 0
    for(i <- num) result += i
    result
  }

  def main(args: Array[String]) {
    aaa("haha")
    //可以覆盖默认的参数值
    aaa("覆盖默认参数值","[","]")
    //如果给出的参数不够,默认参数会从后往前逐个应用进来
    aaa("xx","yy")
    //可以在提供参数值的时候指定参数名，这样参数值顺序和参数列表顺序就不需要完全一致。
    aaa(right = " )) ",left = " (( ",str = "bbb")
    //混用未命名参数合带名参数，只要那些未命名的参数排在前面即可。
    aaa("ccc",right = " }} ")

    //变长参数sum调用，参数个数不受限
    println("sum = "+sum(2,5,4))
    println("sum = "+sum(1,2))
  }
}
