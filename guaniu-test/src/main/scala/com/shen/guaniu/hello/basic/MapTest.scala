package com.shen.guaniu.hello.basic

/**
 * Created by shenluguo on 2015/10/10.
 */
object MapTest {

  def main(args: Array[String]) {
    //构造map,构造出一个不可变的Map[String,Int],值不可改变。
    val scores = Map("shen" -> 7, "li" -> 11, "ze"-> 1)
    //是一样的，只不过 -> 操作符看上去比括号易读一些
    val scores2 = Map(("shen",7), ("li",11), ("ze",1))
    //这是可变map。
    val scores3 = scala.collection.mutable.Map("shen" -> 7, "li" -> 11, "ze"-> 1)
    //如果想从一个空map开始，需要选定一个map实现，入hashmap，并且要给出参数类型。
    val scores4 = new scala.collection.mutable.HashMap[String,Int]

    //获取map的值
    println(scores("ze"))
//    scores2("ze") = 11; 不可变的map的值是不能变的，会报错
    //更新map的值
    scores3("ze") = 11;
    println(scores3("ze"))

    //迭代映射 for((k,v) <- 映射)  处理k和v,注意以下3个的区别
    for(i <- scores){
      println("==="+i)
    }
    for(i <- scores.keys){
      println("key === "+i)
    }
    for(i <- scores.values){
      println("value === "+i)
    }

    //已排序映射

  }

}
