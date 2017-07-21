package pattern.visit

/**
  * 一个Visitor类，存放要访问的对象
  */
trait Visitor {
  def visit(subject: Subject)
}
