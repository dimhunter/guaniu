package com.shen.guaniu.hello.obj

/**
 * Created by shenluguo on 15/10/12.
 */
class BanShengDemo(val name : String , val desc : String) {

  //类的伴生对象可以被class访问，但并不在作用域中
  //如，BanShengDemo类必须通过BanShengDemo.newUniqueNumber()，而不是newUniqueNumber()直接来访问伴生对象的newUniqueNumber()方法
  val id = BanShengDemo.newUniqueNumber()

  def test1(): Unit ={
    println(id)
  }
}

/**
 * 伴生对象
 */
object BanShengDemo {
  private var lastNumber = 0
  //有返回值就不能使unit了，否则虽不报错，但是也取不到返回值的。
  private def newUniqueNumber() ={
    lastNumber += 1
    lastNumber
  }

  //通常会在object中定义apply方法，apply方法会在如下形式表达式时，被调用。
  //ObjectName(参数1，参数2，...,参数N)
  //一个object中apply方法可以有多个，参数不同即可
  //有了apply方法，就可以不用new来构造对象了
  def apply(name : String)={
    new BanShengDemo(name,"desc")
  }

  def apply(name : String,age : Int)={
    new BanShengDemo(name,"desc")
  }
}