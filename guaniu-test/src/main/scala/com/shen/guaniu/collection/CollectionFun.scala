package com.shen.guaniu.collection

/**
 * Created by shenge on 15/12/9.
 *
 * 将函数映射到集合
 *
 */
object CollectionFun {

  def main(args: Array[String]) {

    val names = List("aa","xx","ee","bb","cc")

    //map方法可以将某个函数应用到集合中的每个元素并产出其结果的集合。
    names.map(_.toUpperCase).foreach(println(_));

    //flatMap和collect函数，还有foreach，看13.9节。

  }

}
