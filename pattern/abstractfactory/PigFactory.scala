package pattern.abstractfactory

/**
 * 工厂实现类
 */
class PigFactory extends Factory{
  override def provide(): Life = {
    return new PigLife();
  }
}
