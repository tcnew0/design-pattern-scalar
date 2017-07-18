package pattern.memento

/**
  * 备忘录模式（Memento）：又叫做快照模式，指在不破坏封装性的前提下，获取到一个对象的内部状态，并在对象之外记录或保存这个状态。在有需要的时候可将该对象恢复到原先保存的状态。
  */
object Main extends App{
  // 原始类
  var original = new Original("old")

  // 存储备忘录
  var storage = new Storage(original.createMemento())
  println("the old value:"+original.getState())
  // modify
  original.setState("new")
  println("the new value:"+original.getState())

  // restore
  original.restoreMemento(storage.getMemento())
  println("the restore value:"+original.getState())
}
