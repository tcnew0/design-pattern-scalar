package pattern.observer

/**
 * 主题实现类
 */
class ConcreteSubject extends Subject{
  
  // 状态
  private var state:String = null;
  
  def this(s:String)={
    this()
    this.state = s
  }
  
  // 状态改变
  def change(state:String){
    this.state = state
    // 通知
    this.notify(state)
  }
}
