package pattern.mediator

/**
  * 中介-实现类
  */
class Mediator extends AbstractMediator{
  def this(a:AbstractColleague,b:AbstractColleague){
    this()
    this.a = a
    this.b = b
  }

  override def affectA: Unit = {
    a.setCard(b.getCard*2)
  }

  override def affectB: Unit = {
    b.setCard(a.getCard*3)
  }
}
