package pattern.interpreter

/**
  * 减法
  */
class Minus extends Expression{
  override def interpret(c: Context): Int = c.a - c.b
}
