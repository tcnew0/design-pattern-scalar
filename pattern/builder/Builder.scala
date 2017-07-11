package pattern.builder

trait Builder {
  def setPart(n:String,des:String)
  def getProduct():Product
}
