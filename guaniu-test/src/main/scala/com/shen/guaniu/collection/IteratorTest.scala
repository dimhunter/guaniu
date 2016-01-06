package com.shen.guaniu.collection

/**
 * Created by shenge on 15/12/9.
 */
object IteratorTest {
  def main(args: Array[String]) {

    val names = List("aa","xx","ee","bb","cc")

    System.getProperties

    //可以用iterator方法从scala的集合中获得一个迭代器，这个迭代器并不是java的那个。而是个scala特质。
    //通常用map等映射到集合的函数更方便，迭代器用在大操作中，对于那些完整构造需要很大开销的集合，比如读文件
    //用迭代器就很有用了，因为迭代器不是将整个文件都读到内存中。
    val itor = names.iterator
    for(elem <- itor){
      println(elem)
    }

  }
}
