package pattern.abstractfactory

/**
 * 接口实现
 */
class PigLife extends Life{
  override def live():Unit={
    println("吃..睡..,猪一样的生活")
  }
}
