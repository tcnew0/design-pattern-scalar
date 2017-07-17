package pattern.iterator

/**
  * 迭代器接口
  */
trait MyIterator[T] {
  // 上一个
  def prev():Any
  // 下一个
  def next():Any
  // 是否还有
  def hasNext():Boolean
}
