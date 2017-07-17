package pattern.iterator

import scala.collection.mutable.ArrayBuffer

/**
  * Created by 15050886 on 2017/7/17.
  */
class ConcreteCollection[T] extends MyCollection[T]{
  // 元素存储
  private var elements = new ArrayBuffer[T]()
  // 获取集合迭代器
  override def iterator(): MyIterator[T] = {
    new ConcreteIterator(this)
  }

  // 获取元素
  override def get(i: Int): Any = {
    elements(i)
  }

  // 集合大小
  override def size(): Int = {
    elements.size
  }

  // 添加元素
  override def add(o: T): Unit = {
    elements.+=(o)
  }

  // 移除元素
  override def remove(o: T): Unit = {
    elements.-=(o)
  }
}
