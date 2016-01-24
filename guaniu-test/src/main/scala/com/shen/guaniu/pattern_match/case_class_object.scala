package com.shen.guaniu.pattern_match

abstract class Person
	//样例类 ，注意case都是直接跟着类定义后边，不是类体的大括号里。
	case class Student(age: Int) extends Person
	case class Worker(age: Int, salary: Double) extends Person
	//样例对象
	case object Shared extends Person
//类体大括号可以省略。
//	{
//	}

object case_class_object {

  def main(args: Array[String]){
    
    
	  def caseOps(person: Person) =  person match {
		  case Student(age) => println("I am " + age + "years old")
		  case Worker(_, salary) => println("Wow, I got " + salary)
		  case Shared => println("No property")
		  }
	  caseOps(Student(19))
	  caseOps(Shared)
    
    val worker = Worker(29, 10000.1)
		//样例类（注意是样例类？）的copy方法创建一个和现有对象一样的新对象（注意是新对象）
		val worker1 = worker.copy()
		//后面括号赋值是修改原属性。
		val worker2 = worker.copy(salary = 19.95)
		val worker3 = worker.copy(age = 30)
  }

}