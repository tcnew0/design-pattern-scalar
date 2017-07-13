package pattern.bridge

/**
 * 桥接模式（Bridge）:把事物和其具体实现分开，使他们可以各自独立的变化。即将抽象化与实现化解耦，使得二者可以独立变化
 */
object Main {
  def main(args: Array[String]): Unit = {
    var bridge = new MyBridge()
    bridge.setSource(new SourceableA())
    bridge.m()
    
    bridge.setSource(new SourceableB())
    bridge.m()
  }
}
