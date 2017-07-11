package pattern.builder

class Product (n:String,des:String){
  var name = n
  var describe = des

  def getName():String = name
  def getDescribe:String = describe
  def setName(_name:String) = name = _name
  def setgetDescribe(_des:String) = describe = _des
  
  def show() = println(this.getName()+"=="+this.getDescribe)
}
