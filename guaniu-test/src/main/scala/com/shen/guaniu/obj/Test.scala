package com.shen.guaniu.obj

/**
 * Created by shenluguo on 15/10/12.
 */
object Test {
  def main(args: Array[String]) {
    //没有参数的方法调用可以不写()
    ObjectTest.staticMethod
    println(ObjectTest.name)

    new BanShengDemo("aa","bb").test1()

    //apply方法，有了apply方法，就可以如下方式new了
    BanShengDemo("aaaaa")
  }
}
