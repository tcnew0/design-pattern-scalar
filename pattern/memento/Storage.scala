package pattern.memento

/**
  * 存储备忘录的类
  */
class Storage(m:Memento) {
  var memento:Memento = m;
  def setMemento(memento:Memento) = this.memento = memento
  def getMemento() = this.memento
}
