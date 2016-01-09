package com.shen.guaniu.basic

/**
 * Created by shenluguo on 2015/10/10.
 */
object MapTest {

  def main(args: Array[String]) {
    //构造map,构造出一个不可变的Map[String,Int],值不可改变。
    val scores = Map("shen" -> 7, "li" -> 11, "ze"-> 1)
    val ss = for((k,v) <- scores) yield (k,v * 0.9)
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
    // +=操作符是给map添加几个新的映射,必须是可变map才行
    scores3 += ("zzz" -> 666, "sss" -> 888)
    println(scores3)
    // -= 操作符是移除某几个键对应的映射
    scores3 -= ("sss","zzz")
    println(scores3)

    //迭代映射 for((k,v) <- 映射)  处理k和v,注意以下5个的区别
    for(i <- scores){
      println("==="+i)
    }
    for(i <- ss){
      println(i)
    }
    for(i <- scores.keys){
      println("key === "+i)
    }
    for(i <- scores.values){
      println("value === "+i)
    }

    for((k,v) <- scores){
      println("Key is " + k + ",value is " + v)
    }
    //如果不想要value，用个占位符_即可
    for((k,_) <- scores){ //placeholder
      println("Key is " + k)
    }

    val aaa = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
    //getOrElse的用法：取第一个参数的value，有则返回该value，没有就返回第二个参数，这其实返回是个Option对象
    println(aaa.getOrElse("Hadoop", 0) + " == "+aaa.getOrElse("HHH", 0))
    aaa += ("R" -> 9)
    aaa -= "Hadoop"


    //SortedMap是已排序映射,默认是hash排序，如果用其他，可以用java的TreeMap。
    val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
    println(sortedScore)

  }

}
