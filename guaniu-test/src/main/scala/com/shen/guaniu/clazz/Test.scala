package com.shen.guaniu.clazz

/**
 * Created by shenluguo on 2015/10/10.
 */
object Test {
  def main(args: Array[String]) {

    val ca = new ClassA();

    //set方法的调用
    ca.age = 3

    //get方法的调用
    println(ca.age)
    ca.sayhello()

    val caa = new ClassAA()
  //对于私有属性生成的get和set方法是访问不到的。
  //caa.age
  //对于val的变量，不会生成setter，赋值是不允许的。会有getter
  //caa.sex = "女"
    println(caa.sex)

    //通过主构造器构建对象
    val p = new Person("shen",18)
    //通过辅助构造器1构建对象,其实辅助构造器最终都会调用主构造器。
    val p1 = new Person("shen")
    //通过辅助构造器2构建对象,其实辅助构造器最终都会调用主构造器。
    val p2 = new Person("shen","130582")
    p.sex = "神"
    p.showinfo()
  }
}
