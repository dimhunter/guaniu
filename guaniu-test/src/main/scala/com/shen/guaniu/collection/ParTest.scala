package com.shen.guaniu.collection

/**
 * Created by shenge on 15/12/9.
 *
 * 并行集合。书上13.17节，未懂
 *
 */
object ParTest {
  def main(args: Array[String]) {

    for(i <- (0 until 100).par)println(i+" ")

  }
}
