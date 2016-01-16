package com.shen.guaniu.traits

/**
 * Created by shenluguo on 15/10/14.
 */
class TraitDemo {

}

trait Serializable {
  //特质的方法不一定都是抽象的，可以带有自己的实现，那么实现特质的子类就可以不重写这个实现了。
  def doSerializable(msg : String ): Unit ={
    println("特质自己实现的方法 = " + msg)
  }
}

trait Logger {
  //这是个抽象方法，不需要将方法声明为abstract，特质中未被实现的方法默认就是抽象的。
  def log(msg : String)
}

/**
 * 特质可以继承一个java类，但是不能同时继承2个不相关的类，如同时继承Excepiton和JFrame，就是不对的，冲突。
 */
trait LogException extends java.lang.Exception with Serializable{
  def logExceptionMsg(msg:String): Unit ={
    println(msg)
  }
}

class ExceptionClazz extends LogException{

}

/**
 * 实现特质用extends，不是implements，实现多个特质，其实后边是特质组，几个特质中间用with连接。
 */
class MyLogger extends Logger with Cloneable with Serializable{
  //在重写特质的抽象方法时可写也可不写override
  override def log(msg: String): Unit = {
    println("子类实现特质的抽象方法 = " + msg)
  }
}

object TraitDemoTest{
  def main(args: Array[String]) {
    val clog = new MyLogger
    clog.log("log")
    clog.doSerializable("Serializable")

    //new 对象时间可以混入不同的特质，很方便。虽然是相同的class，但是是不同对象，且不同对象分别实现了不同特质。
    val objt1 = new TraitDemo with Serializable
    objt1.doSerializable("new对象时加入特质")

    val objt2 = new TraitDemo with Logger {
      //这是个抽象方法，不需要将方法声明为abstract，特质中未被实现的方法默认就是抽象的。
      def log(msg: String): Unit ={
        println("mew对象时加入特质且覆盖抽象特质方法 = "+msg)
      }
    }
    objt2.log("override log aaa")

    val objt3 = new ExceptionClazz
    objt3.logExceptionMsg("exception aaa")
  }
}