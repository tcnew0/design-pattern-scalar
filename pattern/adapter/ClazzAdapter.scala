package pattern.adapter

/**
 * 适配器类，继承了被适配类，同时实现标准接口  
 */
class ClazzAdapter extends Adaptee with Target{
  def p(){
    super.sp();
  }
}
