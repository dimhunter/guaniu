package com.shen.guaniu.function

import java.net.URL

import scala.io.Source

/**
 * 本地函数，也叫内部函数，就是函数中定义的函数。只对包含它的外部函数可见
 *
 * Created by shenge on 16/1/17.
 */
object LocalFun {

  //外部函数
  def processData(url: String, width: Int) {
    //内部函数，就是本地函数，可以直接使用外部函数的参数。
    //内部函数是对内部逻辑的一种隐藏，不想对外暴露。
    def processLine(line: String) {
      if (line.length > width)
        println("= " + line)
    }

    val source = Source.fromURL(url)
    for (line <- source.getLines)
      //对内部函数的调用
      processLine(line)

  }

  def main(args: Array[String]) {
      processData("http://spark.apache.org/", 3)
  }

}
