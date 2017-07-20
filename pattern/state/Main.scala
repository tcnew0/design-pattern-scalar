package pattern.state

/**
  * 状态模式（State）: 一个对象在其内部状态改变的时候改变其行为。
  */
object Main extends App{
  var context = new Context()
  context.setState(new StateA())
  context.doHandle()

  context.setState(new StateB())
  context.doHandle()
}
