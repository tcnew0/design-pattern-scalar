package pattern.command

/**
  * Created by 15050886 on 2017/7/18.
  */
class Invoker(cmd:Command) {
  def action() = cmd.execute()
}
