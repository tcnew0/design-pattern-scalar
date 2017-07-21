package pattern.mediator

/**
  * 同事A-实现类
  */
class ColleagueA extends AbstractColleague{
  // 抽象方法
  override def setCard(card: Int, abstractMediator: AbstractMediator): Unit = {
    this.card = card
    abstractMediator.affectB
  }
}
