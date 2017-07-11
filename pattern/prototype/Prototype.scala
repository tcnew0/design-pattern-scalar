package pattern.prototype

/**
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
class Prototype extends Cloneable{
  var id:String = "";
  var name:String = "";
  def this(i:String,k:String) = {
    this()
    this.id = i
    this.name = k
  }
  
  override def clone(): Prototype = super.clone().asInstanceOf[Prototype]
}
