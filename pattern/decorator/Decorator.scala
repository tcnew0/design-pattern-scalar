package pattern.decorator

/**
 * 装饰类
 */
class Decorator(src:Sourceable) extends Sourceable {
  
  def handle(): Unit = {
    println("装饰前操作...")
    src.handle()
    println("装饰后操作...")    
  }
}
