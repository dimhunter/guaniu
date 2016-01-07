package com.shen.guaniu.file

import sys.process._
/**
 * Created by shenluguo on 15/10/13.
 */
object ShellUtils {
  def main(args: Array[String]) {

//    sys.process.process包提供了和shell程序交互的工具。
//    结尾 ! 操作符返回的结果是被执行程序的返回值：执行成功返回0，否则显示错误的非0值
//    结尾 !! 输出会以字符串的形式返回。
    "ls -al .." !
    val result = "ls -al .." !!
  }
}
