package pattern.mediator

/**
  * 同事抽象类
  */
abstract class AbstractColleague {
  var card:Int = 0
  def getCard:Int = this.card
  def setCard(card:Int) = this.card = card
  // 抽象方法
  def setCard(card:Int,abstractMediator: AbstractMediator)
}
