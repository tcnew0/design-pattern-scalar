package pattern.visit

/**
  * Subject类
  */
trait Subject {
  // 接受将要访问它的对象
  def accept(visitor: Visitor)
  // 获取将要被访问的属性
  def getSubject():String
}
