package pattern.command

/**
  * 命令实现类
  */
class MyCommand(rev:Receiver) extends Command{
  override def execute(): Unit = {
    println("MyCommand..")
    rev.action()
  }
}
