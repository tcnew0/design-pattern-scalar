package pattern.observer

import scala.collection.immutable.List
import java.util.ArrayList

/**
 * 主题
 */
abstract class Subject {
  // 用来保存注册的观察者对象
  var list:ArrayList[Observer] = new ArrayList()
  
  // 注册观察者对象
  def attach(o:Observer) ={
    list.add(o)
    println("注册观察者对象成功："+o)
  }
  
  // 删除观察者对象
  def detach(o:Observer){
    list.remove(o)
  }
  
  // 通知
  def notify(state:String){
    println("当前注册的观察者对象:"+list.size)
    for(x <- 0 until list.size){
      list.get(x).update(state)
    }
  }
}
