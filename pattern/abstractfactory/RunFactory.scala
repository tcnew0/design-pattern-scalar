package pattern.abstractfactory

/**
 * 工厂实现类
 */
class RunFactory extends Factory{
  override def provide():Life = {
    return new RunLife();
  }
}
