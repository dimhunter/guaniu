package com.shen.guaniu.hello.obj

/**
 * 参考同包下Test中的静态调用例子
 *
 * scala没有静态方法或静态字段，用object来实现。
 * object用来作为单例或存放工具方法或常量的地方
 * 高效的共享单个不可变实例
 *
 * Created by shenluguo on 15/10/12.
 */
object ObjectTest {
  val name = "aaa"

  def staticMethod(): Unit ={
    println("this is staticMethod")
  }

}



