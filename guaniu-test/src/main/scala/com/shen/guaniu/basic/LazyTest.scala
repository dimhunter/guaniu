package com.shen.guaniu.basic

import scala.io.Source

/**
 * Created by shenge
 *
 * 当val被声明为lazy，它的初始化将被推迟，直到首次对它取值才会加载。
 *
 */
object LazyTest {

  def main(args: Array[String]): Unit = {

    //当val声明为lazy时，它的初始化会被推迟，知道首次对他进行取值时才会进行初始化
    //这里是读一个不存在的文件，故意写错文件名，如果是lazy，并不会报错,直到下面调用file.getLines取值时才会报错。
    //如果删掉lazy，会直接报错。
    lazy val file = Source.fromFile("/home/shen/aa.txt")
    
    println("aaaaa")
    
    for (line <- file.getLines) println(line)

    }

}