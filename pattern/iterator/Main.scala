package pattern.iterator

/**
  * 迭代子模式（Iterator）:顺序访问聚集中的对象。
  */
object Main extends App{
  var collection = new ConcreteCollection[Int]()
  for(i <- 10 until 20){
    collection.add(i)
  }
  println(collection.size())
  println(collection.get(3))

  collection.remove(13)
  println(collection.get(3))
}
