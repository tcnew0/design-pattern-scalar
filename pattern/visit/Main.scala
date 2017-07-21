package pattern.visit

/**
  * 访问者模式（Visitor）:是一种分离对象数据结构与行为的方法。
  */
object Main extends App{
  var visitor = new MyVisitor;
  var subject = new MySubject;
  subject.accept(visitor)
}
