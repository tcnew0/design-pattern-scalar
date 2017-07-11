package pattern.factory

/**
 * 接口实现
 */
class OtherLife extends Life{
  override def live():Unit={}
    println("非正常生活")
}
