package com.shen.guaniu.basic

/**
 * 正则表达式 和 正则表达式组
 * 正则表达式首先就是构造一个Regex对象，用String的r方法即可。
 */
object RegExpressDemo {

  def main(args: Array[String]): Unit = {
    
    //匹配0-9就是数字，+表示多个数字，匹配多个数字
    val numPattern = "[0-9]+".r

    //3个引号里的东西，表示匹配原生的，不进行转义。3引号里是什么就是什么。
    val numberPattern = """/'[0-9]+""".r
    // \s 在正则表达式里是空格字符(空格，tab，换行，换页，回车)的意思
    val numberPattern2 = """\s+[0-9]+\s+""".r

    val strs = "99345 Scala, 22298 Spark"
    
    // findAllIn返回遍历所有匹配项的迭代器
    for (matchString <- numPattern.findAllIn(strs))
      println("匹配多个数字 = "+matchString)

    // findFirstIn 找到首个匹配项
    println("匹配第一个数字 = "+numPattern.findFirstIn(strs))

    val strs2 = " aa /'99ss java, 222 hadoop"
    println("匹配原生 = "+numberPattern.findFirstIn(strs2))
    println("匹配原生2 = "+numberPattern2.findFirstIn(strs2))

    //正则表达式组
    //分组可以让我们方便的获取子表达式，在想要的子表达式两侧加上圆括号即可。
    //定义了一个多个连续数字和多个连续字母的Regex对象
    val numitemPattern="""([0-9]+) ([a-z]+)""".r
    val line = "93459 spark"
    line match{
        //就是把连续的数字提取成num，把连续字母提取成blog
      case numitemPattern(num, blog) => println("正则分组匹配 = "+num + "\t" + blog)
      case _ => println("Nothing reg ...")
    }

  }

}