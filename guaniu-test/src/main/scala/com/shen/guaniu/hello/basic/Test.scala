package com.shen.guaniu.hello.basic

import com.shen.aa.Haha



/**
 * Created by shenge on 15/10/16.
 */
object Test {

  def main(args: Array[String]) {
    new Haha

    //包是在任何地方都可以声明引入的
    import org.shen._

    new Bbb
  }

}
