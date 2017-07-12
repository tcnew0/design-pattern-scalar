package pattern.adapter

/**
 * 适配器类，直接关联被适配类，同时实现标准接口  
 */
class ObjectAdapter(adaptee:Adaptee) extends Target{
  def p(){
    adaptee.sp()
  }
}
