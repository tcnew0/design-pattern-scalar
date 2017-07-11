# design-pattern-scalar
设计模式温故-scala语言
========基本设计原则==========
开闭原则：对扩展开放，对修改关闭。
里氏替换原则：任何基类可以出现的地方，子类一定可以出现。
依赖倒转原则：针对接口编程，依赖于抽象而不依赖于具体。
接口隔离原则：使用多个隔离的接口，比使用单个接口要好。
迪米特原则：最少知道原则，一个实体应该尽量少与其他实体发生相互关系，使得系统模块之间相互独立。
合成复用原则：尽量使用合成/聚合，而不是继承。
========基本设计原则==========
1、普通工厂模式
就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
2、抽象工厂模式
创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
