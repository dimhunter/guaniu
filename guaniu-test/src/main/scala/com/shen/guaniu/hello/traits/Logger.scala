package com.shen.guaniu.hello.traits

/**
 * Created by shenluguo on 15/10/14.
 */
trait Logger {

  //这是个抽象方法，不需要将方法声明为abstract，特质中未被实现的方法默认就是抽象的。
  def log(msg : String)

}
