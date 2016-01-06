package com.shen.guaniu.traits

/**
 * 特质可以继承一个java类，但是不能同时继承2个不相关的类，如同时继承Excepiton和JFrame，就是不对的，冲突。
 * Created by shenluguo on 15/10/14.
 */
trait LogException extends java.lang.Exception with Serializable{
  def logExceptionMsg(msg:String): Unit ={
    println(msg+"=="+doSerializable(getMessage))
  }
}
