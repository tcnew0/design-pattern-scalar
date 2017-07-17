package pattern.iterator

/**
  * 集合：接口
  */
trait MyCollection[T] {
  // 获取集合迭代器
  def iterator():MyIterator[T]
  // 获取元素
  def get(i:Int):Any
  // 添加元素
  def add(o:T)
  // 移除元素
  def remove(o:T)
  // 集合大小
  def size():Int
}
