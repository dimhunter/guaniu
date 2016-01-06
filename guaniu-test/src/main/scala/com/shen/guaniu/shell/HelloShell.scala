package com.shen.guaniu.shell

import sys.process._

/**
 * Created by shenge on 15/12/11.
 */
object HelloShell {

  def main(args: Array[String]) {
    // sys.process包含一个字符串到ProcessBuilder对象的隐式转换，! 操作符执行的就是这个ProcessBuilder对象
    // ! 操作符返回结果是被执行程序的返回值，是个int。成功是0，否则显示错误的非0值
    val resutlt = "cmd /c dird" !

    // !! 操作符使输出会以字符串形式返回。
    val resutlt2 = "cmd /c dir" !!

    println("bbb=="+resutlt)
    println("aaa=="+resutlt2)
  }

}
