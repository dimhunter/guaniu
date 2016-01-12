package com.shen.guaniu.clazz

/**
 * 对象私有属性。
 */
class Person2 {
  private var age = 0
  //private[this] 表示对象私有属性，只有这个类中的自己方法可以访问，比如current方法，new 的该Person的其他对象就不能访问。
  private[this] var sex = "man"
  def increment(){age += 1}
  def current = age+" == "+sex
  
  def act(person: Person){
    person.age
  }
    
  
}

class Student{
  private var privateAge = 0
  val name = "Scala"
  def age = privateAge  
  //对象可以访问类的private属性，但是不能访问private[this]的属性。
  def isYounger(other: Student) = privateAge < other.privateAge
  //不能访问到sex，因为是private[this],是对象私有。
//  def getSex(other: Student) = other.sex
}

object HelloOOP {

  def main(args: Array[String]): Unit = {
    val person = new Person2()
    person.increment()
    person.increment()
    println(person.current)

    val student = new Student
    //
//    student.age = 10
    println(student.age)
    
    val student2 = new Student
    println(student2.name)
    
  }

}