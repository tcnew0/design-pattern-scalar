package pattern.composite

import scala.collection.mutable.Set
/**
 * 节点
 */
class TreeNode {
  // 基本属性
  private var name:String = null;
  // 父节点
  private var parent:TreeNode = null;
  // 子节点
  private var children:Set[TreeNode] = Set();
  
  def this(name:String) = {
    this()
    this.name = name
  }
  
  // 名称操作
  def setName(name:String) = this.name = name
  def getName()=this.name
  
  // 父节点操作
  def setParent(parent:TreeNode)= this.parent = parent
  def getParent()=this.parent
  
  // 子节点操作
  def getChildren()=this.children
  def addChild(child:TreeNode)=this.children.add(child)
  def removeChild(child:TreeNode)=this.children.remove(child)
  
}
