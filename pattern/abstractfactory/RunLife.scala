package pattern.abstractfactory

/**
 * 接口实现
 */
class RunLife extends Life{
  override def live():Unit={
    println("行走的生活方式");
  }
}
