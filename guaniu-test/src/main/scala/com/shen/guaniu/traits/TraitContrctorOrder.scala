package com.shen.guaniu.traits

class Human{
  println("Human")
}
trait TTeacher extends Human {  
  println("TTeacher")
  def teach 
}  
trait PianoPlayer extends Human {  
  println("PianoPlayer")
  def playPiano = {println("I am playing piano. ")}
}  

object TraitContrctorOrder extends App{
  //特质也可以有构造器，由字段的初始化和语句构成，多个特质的构造顺序是从前往后的。
  //和多个特质相同的方法调用顺序super，是相反的。
   val t2 = new Human with TTeacher with PianoPlayer {
      def teach = {println("I'm teaching students.")} }
   t2.playPiano
   t2 teach
}