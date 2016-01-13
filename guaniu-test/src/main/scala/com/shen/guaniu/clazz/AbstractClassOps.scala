package com.shen.guaniu.clazz

class AbstractClassOps{
	var id : Int = _
}

abstract class SuperTeacher(val name : String){
  var id : Int
  var age : Int
  def teach
}

class TeacherForMaths(name : String) extends SuperTeacher(name){
  //重写抽象字段和抽象方法可以写override，也可以不写。为了形象，一般写上override。
  override var id = name.hashCode()
  override var age = 29
  override def teach{
    println("Teaching!!!")
  }
}


object AbstractClassOps{
  def main(args: Array[String]) {
	  val teacher = new TeacherForMaths("Spark")
	  teacher.teach
	  
	  println("teacher.id" + ":" + teacher.id)
	  println(teacher.name + ":" + teacher.age)
    
  }
}