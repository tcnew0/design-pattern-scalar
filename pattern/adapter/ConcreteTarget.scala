package pattern.adapter

/**
 * 具体目标类，只提供普通功能  
 */
class ConcreteTarget extends Target {
  def p(){
    println("普通类 具有 普通功能...")
  }
}
