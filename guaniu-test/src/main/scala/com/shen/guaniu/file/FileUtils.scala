package com.shen.guaniu.file

import java.io.{PrintWriter, File}

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

    //输出到文件
    val writer = new PrintWriter(new File("scalaFile.txt" ))
    for (i <- 1 to 100) writer.println(i)
    writer.close()

    print("Please enter your input : " )
    val line = readLine
    println("Thanks, you just typed: " + line)


  }
}
