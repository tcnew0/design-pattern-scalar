package pattern.adapter

object ObjectMain {
  
  def main(args:Array[String]){
    // 使用普通功能
    var target = new ConcreteTarget()
    target.p()
    
    // 使用特殊功能类，即适配器,需要先创建一个被适配类的对象作为参数  
    var targetAdapter = new ObjectAdapter(new Adaptee())
    targetAdapter.p()
  }
}
