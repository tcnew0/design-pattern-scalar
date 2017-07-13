package pattern.facade

/**
 * 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
object Main {
  def main(args: Array[String]): Unit = {
    var computer = new Computer()
    computer.start()
    computer.showdown()
  }
}
