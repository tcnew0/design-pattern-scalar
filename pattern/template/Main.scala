package pattern.template

/**
 * 模板方法模式（Template Method）:定义一个操作中的算法的骨架，将步骤延迟到子类中。模板方法使得子类能够不去改变一个算法的结构即可重定义算法的某些特定步骤。
 */
object Main extends App{
  new ConcreteTemplate().templateMethod()
}
