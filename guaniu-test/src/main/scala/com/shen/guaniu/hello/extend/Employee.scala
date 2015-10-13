package com.shen.guaniu.hello.extend

/**
 * Created by shenluguo on 15/10/13.
 */
class Employee extends Person{
  var salary = 0.0

  //scala中重写一个非抽象方法必须使用override（注意是非抽象方法，抽象呢？？？）
  override def showinfo() = {
    println("from subclass = "+getClass.getSimpleName + "[name=" + name + "]")

    //scala中调用父类和java一样，用super
    println("from parentclass with super = "+super.showinfo())
  }

}

//调用父类构造器的主构造器，scala中，不能用super(params)调用父类构造器，应像这样写
class Employee2(name:String,age:Int,val salary : Double) extends Person2(name:String,age:Int){

}
