package pattern.visit

/**
  * 实现类
  */
class MySubject extends Subject{
  // 接受将要访问它的对象
  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  // 获取将要被访问的属性
  override def getSubject(): String = {
    "love scala"
  }
}
