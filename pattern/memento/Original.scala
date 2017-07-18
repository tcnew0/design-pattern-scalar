package pattern.memento

/**
  * 原始类-发起者
  */
class Original {
  var state:String = null;
  def this(s:String){
    this()
    this.state = s
  }

  def setState(s:String) = this.state = s
  def getState() = this.state

  // 创建备忘录
  def createMemento(): Memento ={
    new Memento(this.state)
  }

  // 恢复
  def restoreMemento(m:Memento): Unit ={
    this.setState(m.getState())
  }
}
