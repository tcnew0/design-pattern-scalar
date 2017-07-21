package pattern.interpreter

/**
  * 解释器模式：定义语言的文法，并且建立一个解释器来解释该语言中的句子。
  */
object Main extends App{
  var context = new Context(1,9)
  println(new Plus().interpret(context))
  println(new Minus().interpret(context))
}
