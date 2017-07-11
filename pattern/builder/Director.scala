package pattern.builder

/**
 * 向导类
 */
class Director {
  private var builder = new ConcreteBuilder();
  
  def builderA():Product = {
    builder.setPart("A", "a product")
    builder.getProduct()
  }
  
  def builderB():Product = {
    builder.setPart("B", "b product")
    builder.getProduct()
  }
}
