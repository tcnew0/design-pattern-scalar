package pattern.observer

/**
 * 观察者模式（Observer）:当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化。
 */
object Main extends App{
  var sub = new ConcreteSubject()
  sub.attach(new ConcreteObserver())
  sub.attach(new ConcreteObserver())
  sub.change("删除")
}
