package pattern.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Method

/**
 * 动态代理类
 */
class DynaProxy(obj:Any) extends InvocationHandler{
  
  def invoke(proxy:Any,method:Method,args:Array[Object]):Object={
    before()
    var result = method.invoke(this.obj, args);
    after()
    
    result
  }
  
  private def before(){
    println("调用方法之前执行！")
  }
  
  private def after(){
    println("调用方法之后执行！")
  }
}
