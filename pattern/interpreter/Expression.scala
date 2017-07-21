package pattern.interpreter

/**
  * 解释器接口
  */
trait Expression {
  def interpret(c:Context):Int
}
