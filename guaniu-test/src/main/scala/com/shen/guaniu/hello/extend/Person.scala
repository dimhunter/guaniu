package com.shen.guaniu.hello.extend

/**
 * Created by shenluguo on 15/10/13.
 */
class Person {
  var name = "sss"

  def showinfo()={
    println("base class")
  }
//  override def toString = getClass.getName + "[name=" + name + "]"
}


class Person2(name:String,age:Int){

}