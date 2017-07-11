package pattern.factory

// test method
object Main{
  def main(args: Array[String]): Unit = {
    var factory = new Factory();
    factory.createLife("pig").live()
    factory.createLife("push").live()
    factory.createLife("2233").live()
    factory.createLife("run").live()
  }
}
