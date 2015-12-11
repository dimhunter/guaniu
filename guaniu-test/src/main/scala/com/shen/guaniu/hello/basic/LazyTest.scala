package com.shen.guaniu.hello.basic

import scala.io.Source

/**
 * Created by shenge on 15/12/6.
 *
 * 当val被声明为lazy，它的初始化将被推迟，直到首次对它取值才会加载。
 *
 */
object LazyTest {

  def main(args: Array[String]) {
    //如果不加lazy，会立马报错，找不到文件。加了lazy，只有在用到结果words的时候才会加载，才会报错。比如println()一下words
    lazy val words = Source.fromFile("/home/shen/aa.txt")

  }

}
