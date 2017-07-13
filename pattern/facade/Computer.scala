package pattern.facade

/**
 * 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
class Computer() {
  val cpu:Cpu = new Cpu()
  val disk:Disk = new Disk()
  val memory:Memory = new Memory()
  
  def start(){
    cpu.start()
    memory.start()
    disk.start()
  }
  
  def showdown(){
    disk.shutdown()
    memory.shutdown()
    cpu.shutdown()
  }
}
