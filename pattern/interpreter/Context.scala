package pattern.interpreter

/**
  * 上下文环境：语言的文法
  */
class Context {
  var a,b:Int = 0
  def this(a:Int,b:Int){
    this()
    this.a = a
    this.b = b
  }
}
