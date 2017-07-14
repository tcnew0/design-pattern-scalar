package pattern.observer

/**
 * 观察者接口
 */
trait Observer {
  def update(state:String)
}
