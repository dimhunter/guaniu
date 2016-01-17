package com.shen.guaniu.function

import javax.swing.JButton
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.JFrame

/**
 * SAM 就是single abstract method的简称。
 * 就是隐式转换，对java中样板代码的替换和简写。
 */
object SAMDemo {

  def main(args: Array[String]){
    
    var data = 0
    val frame = new JFrame("SAM Testing");
    val jButton = new JButton("Counter")
    //java中的样板代码
    jButton.addActionListener(new ActionListener {
      override def actionPerformed(event: ActionEvent) {
        //应该只关注函数的业务逻辑部分
        data += 1
        println(data)
      }
    })
    frame.setContentPane(jButton);
    frame.pack();
    frame.setVisible(true);


    //隐式转换部分
    implicit def convertedAction(action: (ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(event: ActionEvent) { action(event) }
    }
    var data2 = 0
    val frame2 = new JFrame("SAM Testing2");
    val jButton2 = new JButton("Counter2")
    //隐式转换后的简单写法，如果注释掉上面的隐式转换部分，会报错
    jButton2.addActionListener((event: ActionEvent) => {data2 += 1; println("="+data2)})

    frame2.setContentPane(jButton2);
    frame2.pack();
    frame2.setVisible(true);
  }

}