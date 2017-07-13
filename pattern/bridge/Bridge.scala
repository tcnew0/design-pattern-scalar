package pattern.bridge

/**
 * 桥接类
 */
abstract class Bridge {
  // 目标接口引用
  private var source:Sourceable = null;
  
  def setSource(s:Sourceable)= this.source = s
  def getSource()=this.source
  
  // 抽象方法
  def m()
}
