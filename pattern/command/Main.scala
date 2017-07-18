package pattern.command

/**
  * 命令模式（Command）:将一个请求封装为一个对象，通过对不同的请求进行参数化；将”发出请求的对象”和”接收与执行这些请求的对象”分隔开来。
  */
object Main extends App{
  new Invoker(new MyCommand(new Receiver())).action()
}
