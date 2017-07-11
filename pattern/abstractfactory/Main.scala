package pattern.abstractfactory

/**
 * 抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
object Main {
  def main(args: Array[String]): Unit = {
    var run = new RunFactory();
    run.provide().live();

    var pig = new PigFactory();
    pig.provide().live();
  }
}
