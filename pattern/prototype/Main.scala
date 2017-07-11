package pattern.prototype

/**
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
object Main {

  def main(args: Array[String]) {
    var p = new Prototype("2","3");
    println(p.clone().id)
  }
}
