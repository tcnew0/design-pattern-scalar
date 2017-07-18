package pattern.chain

/**
  * 责任链模式（Chain of Responsibility）:使多个对象都有机会处理请求,将这个对象连成一条链，并沿着这条链传递该请求，
  * 直到有一个对象处理他为止。
  */
object Main extends App{
  var handlerOne = new ConcreteHandler()
  var handlerTwo = new ConcreteHandler()
  var handlerThree = new ConcreteHandler()
  handlerOne.setHandler(handlerTwo)
  handlerTwo.setHandler(handlerThree)

  handlerOne.operate()
}
