package com.shen.guaniu.traits

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Created by shenge on 16/1/16.
 */
class MixedTraitDemo extends Logged {
  def doSomething(msg:String): Unit ={
    log(msg)
  }
}

trait Logged{
  def log(msg : String){}
}
//输出到控制台的日志
trait ConsoleLogger extends Logged{
  override def log(msg:String){
    println("ConsoleLogger = "+msg)
    println(msg)}
}
//添加时间戳的日志
trait TimestampLogger extends Logged{
  override def log(msg:String): Unit ={
    println("TimestampLogger = "+msg)
    super.log(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" "+msg)
  }
}
trait ShortLogger extends Logged{
  //特质中的字段,可以是具体的，也可以是抽象的。如果没有给出初始值，就是抽象的。
  //特质中未被初始化的字段在具体的子类中必须被重写。
  val maxLength = 10
  override def log(msg:String): Unit ={
    println("ShortLogger = "+msg)
    super.log(
      if(msg.length <= maxLength) msg else msg.substring(0,maxLength-3)+"..."
    )
  }
}

object MixedTraitTest{
  def main(args: Array[String]) {
    //比较o1和o2的特质顺序，对于互相调用的log，super调用的就是下一个特质，不过是从后往前的顺序。注意和特质的构造顺序是不一样的。
    val o1 = new MixedTraitDemo with ConsoleLogger with TimestampLogger with ShortLogger
    val o2 = new MixedTraitDemo with ConsoleLogger with ShortLogger with TimestampLogger
    o1.doSomething("o111111dothings1")
    o2.doSomething("o222222dothings2")
  }
}
