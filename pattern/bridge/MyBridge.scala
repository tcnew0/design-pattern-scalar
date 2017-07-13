package pattern.bridge

/**
 * 桥接具体实现类
 */
class MyBridge extends Bridge{
  def m()=this.getSource().m()
}
