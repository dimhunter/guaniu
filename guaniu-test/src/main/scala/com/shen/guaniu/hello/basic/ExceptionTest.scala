package com.shen.guaniu.hello.basic

import java.io.{InputStream, IOException}
import java.net.URL

import scala.xml.MalformedAttributeException

/**
 * Created by shenge on 15/12/6.
 */
object ExceptionTest {

  //scala 异常也是 try catch finally 结构，但是scala没有“受检”异常，比如IO异常等必须处理的异常
  def main(args: Array[String]) {

    var in:InputStream = null
    try{
      //do something
      in = new URL("http://www.aaa.com").openStream()
    }catch {
      //捕获异常的语法采用模式匹配方法
      //如果不需要使用捕获的对象，可以用下划线 _ 来代替变量名
      case _ : MalformedAttributeException => println("bad url")
      //和java一样，更通用的异常应该排在更具体的异常之后
      case ex : Exception => println("error !") ; ex.printStackTrace()
    }finally {
      if(null != in)
        in.close()
    }


  }

}
