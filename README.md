# design-pattern-scalar
设计模式温故-scala语言</br>
========基本设计原则==========</br>
开闭原则：对扩展开放，对修改关闭。</br>
里氏替换原则：任何基类可以出现的地方，子类一定可以出现。</br>
依赖倒转原则：针对接口编程，依赖于抽象而不依赖于具体。</br>
接口隔离原则：使用多个隔离的接口，比使用单个接口要好。</br>
迪米特原则：最少知道原则，一个实体应该尽量少与其他实体发生相互关系，使得系统模块之间相互独立。</br>
合成复用原则：尽量使用合成/聚合，而不是继承。</br>
========基本设计原则==========</br></br>
1、普通工厂模式</br>
就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建</br>
2、抽象工厂模式</br>
创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。</br>
3、单例模式（Singleton）</br>
单例对象能保证在一个JVM中，该对象只有一个实例存在</br>
4、建造者模式（Builder）</br>
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。</br>
5、原型模式</br>
将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象</br>
6、适配器模式（Adapter）    
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。</br>
7、装饰模式（Decorator）   
给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例。    
8、代理(Proxy)</br>
提供了对目标对象另外的访问方式;即通过代理对象访问目标对象。</br>
注意：</br>
    代理模式和装饰模式非常类似，甚至代码都类似。二者最主要的区别是：代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。</br>
9、外观模式（Facade）</br>
为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。</br>
10、桥接模式（Bridge）</br>
把事物和其具体实现分开，使他们可以各自独立的变化。即将抽象化与实现化解耦，使得二者可以独立变化。</br>
11、组合模式（Composite）</br>
将多个对象组合在一起进行操作,常用于表示树形结构中，例如二叉树等。</br>
12、享元模式（Flyweight）</br>
主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。</br>
13、策略模式（strategy）</br>
定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。</br>
14、模板方法模式（Template Method）</br>
定义一个操作中的算法的骨架，将步骤延迟到子类中。模板方法使得子类能够不去改变一个算法的结构即可重定义算法的某些特定步骤。</br>
15、观察者模式（Observer）</br>
当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化。</br>
16、迭代子模式（Iterator）:顺序访问聚集中的对象。</br>
17、责任链模式（Chain of Responsibility）</br>
使多个对象都有机会处理请求,将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。</br>
18、命令模式（Command）</br>
将一个请求封装为一个对象，通过对不同的请求进行参数化；将”发出请求的对象”和”接收与执行这些请求的对象”分隔开来。</br>
19、备忘录模式（Memento）</br>
又叫做快照模式，指在不破坏封装性的前提下，获取到一个对象的内部状态，并在对象之外记录或保存这个状态。在有需要的时候可将该对象恢复到原先保存的状态。</br>
20、状态模式（State）: 一个对象在其内部状态改变的时候改变其行为。</br>
21、访问者模式（Visitor）:是一种分离对象数据结构与行为的方法。</br>
22、
23、
