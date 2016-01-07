package com.shen.guaniu.basic

import com.shen.guaniu.hello.basic.com.shen.aa.Haha
import com.shen.guaniu.hello.basic.org.shen.Bbb


/**
 * Created by shenge on 15/10/16.
 */
object Test {

  def main(args: Array[String]) {
    new Haha

    //包是在任何地方都可以声明引入的
    import com.shen._

    new Bbb
  }

}
