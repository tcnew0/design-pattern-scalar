package pattern.flyweight

import scala.collection.immutable.HashMap
import scala.collection.mutable.Map

/**
 * 工厂方法产生所需要的享元对象
 */
class FlyweightFactory {
  private var factory:HashMap[Int,Flyweight] = new HashMap[Int,Flyweight];
  
  def factory(state:Int):Flyweight = {
    // 取值
    var flyweight:Flyweight = null;
    if(!factory.contains(state)){
      flyweight = new ConcreteFlyweight(state)
      // 追加
     factory+=(state -> flyweight)
    }else{
      flyweight = factory.apply(state)
    }
    
    flyweight
  }
}
