package com.shen.guaniu.file

import java.io.File

import scala.io.Source

/**
 * Created by shenluguo on 15/10/13.
 */
object FileUtils {
  def main(args: Array[String]) {

    val filea = new File("d://aaa.txt");

//    val source = Source.fromFile("d://aaa.txt","utf-8")
    val source = Source.fromFile(filea,"utf-8");
    //读取行
    val lines = source.getLines();

    for(i <- lines){
      println(i)
    }
    //用完Source对象后要关闭
    source.close()

      val webFile = Source.fromURL("http://spark.apache.org/")
      webFile.foreach(print)
      webFile.close


  }
}
