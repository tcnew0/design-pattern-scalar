package pattern.builder

/**
 * 实现类
 */
class ConcreteBuilder extends Builder {
  var product = new Product("","");
  def getProduct(): Product = {
    product
  }

  def setPart(n: String, des: String): Unit = {
    product.setName(n)
    product.setgetDescribe(des)
  }
}
