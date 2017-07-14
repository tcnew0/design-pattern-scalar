package pattern.flyweight

/**
 * 享元模式（Flyweight）：主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 */
object Main {
  def main(args: Array[String]): Unit = {
    var fc = new FlyweightFactory()
    fc.factory(1).op()
    fc.factory(2).op()
    fc.factory(3).op()
    fc.factory(1).op()
  }
}
