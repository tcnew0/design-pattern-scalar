package pattern.decorator

/**
 * 装饰模式:给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 */
object Main {
  def main(args:Array[String]) {
    new Decorator(new Source()).handle();
  }
}
