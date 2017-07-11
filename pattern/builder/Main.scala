package pattern.builder

/**
 * 创建类模式:将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
object Main {
  def main(args: Array[String]): Unit = {
    var director = new Director()
    director.builderA().show()
    director.builderB().show()
  }
}
