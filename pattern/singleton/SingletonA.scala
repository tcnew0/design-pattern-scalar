package pattern.singleton

/**
 * 单例模式：单例对象能保证在一个JVM中，该对象只有一个实例存在
 */
class SingletonA private{
  def call()= println("呼叫...")
}

/**
 * 伴生对象
 */
object SingletonA{
  private val instance = new SingletonA();

  def getInstance():SingletonA = {
    instance;
  }
}
