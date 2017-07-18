package pattern.chain

/**
  * Created by 15050886 on 2017/7/18.
  */
class ConcreteHandler extends Handler{
  // 操作处理
  override def operate(): Unit = {
    if(this.getHandler() != null){
      println("pass the request.")
      this.getHandler().operate()
    }else{
      println("handle this request.")
    }
  }
}
