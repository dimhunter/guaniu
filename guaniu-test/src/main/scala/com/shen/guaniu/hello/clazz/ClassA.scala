package com.shen.guaniu.hello.clazz

/**
 * Created by shenluguo on 2015/10/10.
 *
 * 一个类如果没有显示定义主构造器，则自动拥有一个无参主构造器。
 */
class ClassA {

  //必须初始化字段
  //！！！ scala中，对每个字段都自动提供getter和setter方法，包括private属性
  //！！！和java不同，scala对应的getter和setter方法分别叫 age 和 age = (注意此处和书上对比，是否一样，包含_)
  var age = 0

  //主构造器会执行类定义中的所有语句。
  println("ClassA类中定义的语句");

  //方法默认都是public
  def sayhello(){
    println("this is ClassA")
  }
}

class ClassAA{
  //private属性的get，set方法也是有的，只不过都是private的，不能访问
  private var name = "shen"

  //如果变量是val的，那么只会生成getter，不会生成setter，因为不可变。
  val sex = "男"
}

/**
 * 1. 主构造器的参数直接放置在类名之后，参数被编译成字段，其值被初始化成构造时传入的参数。
 *  参数是val和var都可以，也可以不写。如果不写val或var，参数如何处理取决于他们在类中如何被使用。
 * 2. 主构造器会执行类定义中的所有语句。
 * @param name
 * @param age
 */
class Person(val name:String , val age : Int) {

  var sex = "男"

  //主构造器会执行类定义中的所有语句。
  println("Person类中定义的语句");

  def showinfo(): Unit ={
    println("this is Person")
    println("name = "+name)
    println("age = "+age)
    println("sex = "+sex)
  }

  //scala可以有任意多的构造器，不过只有一个主构造器，其他都是辅助构造器
  //辅助构造器名称为this，和java是不同的，不必与类同名
  //每个辅助构造器必须以一个先前已定义的其他辅助构造器或主构造器调用开始
  //无论是new主构造器，还是辅助构造器，都可以构建对象
  //其实辅助构造器最终都会调用主构造器。
  def this(name : String){
    this(name,18)//调用主构造器
    println("辅助构造器1")
  }

  def this(name:String,idcard:String){
    this(name)//调用前一个辅助构造器
    println("辅助构造器2")
  }

}


