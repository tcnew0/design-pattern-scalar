package pattern.decorator

/**
 * 接口实现类
 */
class Source extends Sourceable {
  def handle(): Unit = {
    println("do handle..")
  }
}
