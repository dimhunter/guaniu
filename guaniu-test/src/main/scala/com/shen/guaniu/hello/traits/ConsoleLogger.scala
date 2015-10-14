package com.shen.guaniu.hello.traits

/**
 * 实现特质用extends，不是implements，实现多个特质，其实后边是特质组，几个特质中间用with连接。
 *
 * Created by shenluguo on 15/10/14.
 */
class ConsoleLogger extends Logger with Cloneable with Serializable{

  //在重写特质的抽象方法时不需要写override
  def log(msg: String): Unit = {
    println("子类实现特质的抽象方法 = " + msg)
  }

  def doClone(msg: String): Unit ={
    println("子类实现特质的抽象方法 = " + msg)
  }
}
