package pattern.composite

/**
 *组合模式（Composite）:将多个对象组合在一起进行操作,常用于表示树形结构中，例如二叉树等。
 */
object Main {
  
  def main(args:Array[String]){
    var root = new TreeNode("root")
    
    var node = new TreeNode("node");
    root.addChild(node)
    
    node.addChild(new TreeNode("A"))
    node.addChild(new TreeNode("B"))
    var c = new TreeNode("C")
    node.addChild(c)
    
    println(root.getChildren().find(_ == node).get.getName()) 
  }
}
