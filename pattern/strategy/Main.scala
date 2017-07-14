package pattern.strategy


/**
 * 策略模式（strategy）：定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 */
object Main extends App{
  var context = new Context(new StrategyA())
  context.handle()
}
