package pattern.state

/**
  * 具体实现类B
  */
class StateB extends State{
  override def handle(): Unit = println("StateB handler.")
}
