package pattern.mediator

/**
  * 中介抽象类
  */
abstract class AbstractMediator {
  protected var a:AbstractColleague = null
  protected var b:AbstractColleague = null

  def affectA
  def affectB
}
