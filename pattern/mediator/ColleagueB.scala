package pattern.mediator

/**
  * 同事B-实现类
  */
class ColleagueB extends AbstractColleague{
  // 抽象方法
  override def setCard(card: Int, abstractMediator: AbstractMediator): Unit = {
    this.card = card
    abstractMediator.affectA
  }
}
