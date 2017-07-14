package pattern.strategy

/**
 * 持有一个Strategy的引用
 */
class Context{
  var s:Strategy = null
  def this(s:Strategy)={
    this()
    this.s = s
  }
  
  def setStrategy(s:Strategy)=this.s = s
  def getStrategy()=this.s
  
  def handle() = this.getStrategy().handle()
}
