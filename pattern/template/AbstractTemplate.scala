package pattern.template

/**
 * 模板
 */
abstract class AbstractTemplate {
  
  /**
   * 模板方法
   */
  def templateMethod(){
    before()
    handle()
    after()
    
  }
  
  private def before()=println("准备工作..")
  
  // 抽象方法
  protected def handle()
  
  // 空
  protected def after()={
    
  }
}
