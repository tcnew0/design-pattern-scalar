package pattern.factory

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
class Factory {
  def createLife(way:String):Life = {
    way match{
      case "pig"=>  return new PigLife();
      case "run"=>  return new RunLife();
      case "push"=>  return new PushLife();
      // 其他
      case other=> return new OtherLife();
    }
    
  }
}
