package pattern.flyweight

/**
 * 实现类
 */
class ConcreteFlyweight(s:Int) extends Flyweight {
  def op(): Unit = {
    println("Flyweight op..."+s)
  }
}
