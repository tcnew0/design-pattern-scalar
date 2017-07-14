package pattern.observer

/**
 * 实现类
 */
class ConcreteObserver extends Observer{
  def update(state:String) = println("ConcreteObserver update.."+state)
}
