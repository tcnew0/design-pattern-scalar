package pattern.interpreter

/**
  * 加法
  */
class Plus extends Expression{
  override def interpret(c: Context): Int = {
    c.a + c.b
  }
}
