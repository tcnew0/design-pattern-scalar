package pattern.memento

/**
  * 备忘录类
  */
class Memento {
  var state:String = null;
  def this(s:String){
    this()
    this.state = s
  }

  def setState(s:String) = this.state = s
  def getState() = this.state
}
