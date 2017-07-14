package pattern.template

/**
 * 具体实现
 */
class ConcreteTemplate extends AbstractTemplate{
  
  /**
   * 实现模板方法
   */
  def handle(){
    println("do handle..")
  }
  
  override def after()=println("重写后续处理")
}
