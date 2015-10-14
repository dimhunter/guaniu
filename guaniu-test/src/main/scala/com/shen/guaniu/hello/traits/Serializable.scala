package com.shen.guaniu.hello.traits

/**
 * Created by shenluguo on 15/10/14.
 */
trait Serializable {

  //特质的方法不一定都是抽象的，可以带有自己的实现，那么实现特质的子类就可以不重写这个实现了。
  def doSerializable(msg : String ): Unit ={
    println("特质自己实现的方法 = " + msg)
  }
}
