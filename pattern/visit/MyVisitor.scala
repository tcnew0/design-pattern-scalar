package pattern.visit

/**
  * 实现类
  */
class MyVisitor extends Visitor{
  override def visit(subject: Subject): Unit = {
    println(subject.getSubject())
  }
}
