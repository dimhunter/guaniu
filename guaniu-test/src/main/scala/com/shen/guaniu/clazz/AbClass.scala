package com.shen.guaniu.clazz

/**
 * 抽象类，abstract关键字来标记不能被实例化的类，通常是因为他的某个或几个方法没有被完整定义
 *
 * 只有抽象类才可以有抽象字段和抽象方法
 *
 * Created by shenge on 15/10/16.
 */
abstract class AbClass {

  //抽象字段就是一个没有初始值的字段
  val id : Int

  //和java不同，没有方法体，就是抽象方法，不需要abstract关键字
  //子类中重写超类抽象方法时，不需要override关键字
  def getId : Int

}
