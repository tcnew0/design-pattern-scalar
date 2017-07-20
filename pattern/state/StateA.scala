package pattern.state

/**
  * 具体实现类A
  */
class StateA extends State{
  override def handle(): Unit = {
    println("StateA handler.")
  }
}
