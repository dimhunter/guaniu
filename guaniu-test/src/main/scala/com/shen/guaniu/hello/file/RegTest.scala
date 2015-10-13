package com.shen.guaniu.hello.file

/**
 * 正则表达式和正则表达式组例子
 * Created by shenluguo on 15/10/13.
 */
object RegTest {
  def main(args: Array[String]) {

    val numPattern = "[0-9]+".r
    for(matchStr <- numPattern.findAllIn("fdsas13j5dfau79fe24j6..80")){
      println(matchStr)
    }

    //正则表达式组
    val groupPattern = "([0-9]+)..#([a-z]+)".r
    //将num设置为99，item设置为aaa
    val groupPattern(num,item) = "99..#aaa"
    println(num+"--"+item)
  }
}
