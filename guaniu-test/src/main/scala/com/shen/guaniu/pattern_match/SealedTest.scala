package com.shen.guaniu.pattern_match

/**
 * 密封类
 *
 * Created by shenge on 16/1/24.
 */

//sealed关键字表示密封类，当你用样例类做模式匹配时，想让编译器帮你确保已经列出了所有的可能子类，可以用sealed
//这样密封类的所有子类都必须在该密封类相同的文件中定义。
sealed abstract class SealedTest
  case class SealedA(a:String) extends SealedTest
  case class SealedB(a:String,b:String) extends SealedTest

//比如如果想加个SealedC子类，有了sealed，就必须定义在这个源文件里。
  case class SealedC(c:Integer) extends SealedTest
