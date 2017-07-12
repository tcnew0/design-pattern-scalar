package pattern.adapter

/**
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
 * 类的适配器模式
 */
object ClazzMain {
  def main(args: Array[String]): Unit = {
    // 使用普通功能
    var target = new ConcreteTarget()
    target.p()
    
    // 使用特殊功能类，即适配器
    var targetAdapter = new ClazzAdapter()
    targetAdapter.p()
  }
}
