package pattern.singleton

/**
 * 单例模式：单例对象能保证在一个JVM中，该对象只有一个实例存在
 */
object Main {
  
  def main(args: Array[String]): Unit = {
    SingletonA.getInstance().call();
  }
}
