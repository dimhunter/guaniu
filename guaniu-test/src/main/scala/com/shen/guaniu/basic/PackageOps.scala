package com.dt.scala.oop

package com.scala.spark

//people是包对象的概念。书上7.5节，很重要
//包可以包含类，对象和特质，但是不能包含函数或变量的定义，包对象的出现就是为了解决这个局限性
//每个包都可以包含一个包对象，需要在父包中定义，且名字与子包一样。
package object people {
  val defaultName = "Scala"  
}  

package people {  
  class people {
    var name = defaultName
  }
} 

import java.awt.{Color,Font}
import java.util.{HashMap=>JavaHashMap}
import scala.{StringBuilder => _}


class PackageOps {}


package spark.navigation {
  abstract class Navigator{
    def act
  }
  package tests {
    
    class NavigatorSuite
  }
  
  package impls {
    class Action extends Navigator{
      def act = println("Action")
    }
  }
}

package hadoop {
  package navigation {
    class Navigator
  }
  
  package launch {
    class Booster {
      val nav = new navigation.Navigator
      
    }
  }  
}

 


object PackageOps {

  def main(args: Array[String]): Unit = {

  }

}