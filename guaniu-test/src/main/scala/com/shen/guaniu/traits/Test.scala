package com.shen.guaniu.traits

/**
 * Created by shenluguo on 15/10/14.
 */
object Test {
  def main(args: Array[String]) {
    val clog = new ConsoleLogger
    clog.log("log")
    clog.doClone("clone")
    clog.doSerializable("Serializable")

    //new 对象时间可以混入不同的特质，很方便。虽然是相同的class，但是是不同对象，且不同对象分别实现了不同特质。
    val objt1 = new ObjWithTrait with Serializable
    objt1.doSerializable("new对象时加入特质")

    val objt2 = new ObjWithTrait with Logger {
      //这是个抽象方法，不需要将方法声明为abstract，特质中未被实现的方法默认就是抽象的。
      def log(msg: String): Unit ={
        println("mew对象时加入特质且覆盖抽象特质方法 = "+msg)
      }
    }

    val objt3 = new ExceptionClazz
    objt3.logExceptionMsg("bbb")
  }
}
