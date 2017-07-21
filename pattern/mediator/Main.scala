package pattern.mediator

/**
  * 中介者模式（Mediator）:用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使耦合松散，而且可以独立地改变它们之间的交互。
  */
object Main extends App{
  var ca = new ColleagueA
  var cb = new ColleagueB
  var mediator = new Mediator(ca,cb)
  ca.setCard(10,mediator)
  println("===同事a 影响同事b===")
  println("同事a卡号："+ ca.getCard)
  println("同事b卡号："+cb.getCard)

  println("===同事b 影响同事a===")
  cb.setCard(3,mediator)
  println("同事a卡号："+ca.getCard)
  println("同事b卡号："+cb.getCard)
}
