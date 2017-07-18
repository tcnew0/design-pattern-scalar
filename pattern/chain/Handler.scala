package pattern.chain

/**
  * 抽象类
  */
abstract class Handler{
  private var handler:Handler = null
  def this(handler:Handler){
    this()
    this.handler = handler
  }

  // 操作处理
  def operate()

  def setHandler(handler:Handler): Unit ={
    this.handler = handler
  }
  def getHandler() = this.handler

  // other method
}
