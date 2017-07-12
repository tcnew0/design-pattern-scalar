package pattern.proxy

import java.lang.reflect.Proxy;

/**
 * 代理(Proxy):提供了对目标对象另外的访问方式;即通过代理对象访问目标对象.
 * 静态代理代理模式和装饰模式非常类似，甚至代码都类似。
 * 二者最主要的区别是：代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 * 本例为java 动态代理示例
 */
object Main {
  def main(args: Array[String]): Unit = {
    var target = new Target("1")
    // handler
    var handler = new DynaProxy(target)
    // 代理类
    var proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler).asInstanceOf[Target];
    proxy.p() // 报错，scala好像不支持强制转换
  }
}
