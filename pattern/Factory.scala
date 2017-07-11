package pattern

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

/**
 * 接口
 */
trait Life{
  def live():Unit={
    println("default life way")
  }
}
/**
 * 接口实现
 */
class PigLife extends Life{
  override def live():Unit={
    println("吃..睡..,猪一样的生活")
  }
}

/**
 * 接口实现
 */
class RunLife extends Life{
  override def live():Unit={
    println("行走的生活方式");
  }
}

/**
 * 接口实现
 */
class PushLife extends Life{
  override def live():Unit={}
    println("得过且过")
}

/**
 * 接口实现
 */
class OtherLife extends Life{
  override def live():Unit={}
    println("非正常生活")
}

// test method
object Main{
  def main(args: Array[String]): Unit = {
    var factory = new Factory();
    factory.createLife("pig").live()
    factory.createLife("push").live()
    factory.createLife("2233").live()
    factory.createLife("run").live()
  }
}
