package pattern.state

/**
  * 上下文
  */
class Context() {
  var state: State = null

  def this(state: State){
    this()
    this.state = state
  }

  def setState(state: State) = this.state = state
  def getState() = this.state

  def doHandle() = state.handle()
}
