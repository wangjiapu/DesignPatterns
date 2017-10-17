
# Java设计模式

## 简单工厂
##### 优点
    
1.  工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,
        决定究竟应该创建哪个具体类的对象.通过使用工厂类,外界可以从直接
        创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。
        而不必管这些对象究竟如何创建及如何组织的．明确了各自的职责和权利，
        有利于整个软件体系结构的优化。
2. 通过引入配置文件和反射，可以在不修改任何客户端代码的情况下更换和增加新的具体产品类，在一定程度上提高了系统的灵活性
3. 客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可， 对于一些复杂的类名，通过简单工厂模式可以减少使用者的记忆量
##### 缺点
1. 由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；
2. 它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了
3. 当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．
4. 这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延,对系统的维护和扩展非常不利；
    
## 单例 
1. 饿汉：
    类一加载就创建对象


2. 懒汉：
    用的时候才去加载对象


***单例模式的一般步骤:***
1. 私有化构造方法使其外部不能直接创建对象保证对象的唯一性
2. 私有化和静态化自己内部的对象(因为外部不能new对象只能内部来new了)
3. 提供一个公共的静态的方法给外部直接使用自己内部创建的对象

## Builder模式
##### 缺点
在使用构建器的时候，必须利用另外一个类来实例化另外一个类，这样子会使创建的时候创建更多的对象。
这样子会损耗一定的性能...不过带来的好处是非常明显的。因为使用builder模式，每次设置属性的时候，
都是具名的方法操作，是开发人员更容易使用，并且不需要给宿主

##### 优点
使用方便

## 原型模式
##### 优点
没有复杂的继承关系将对一个对象中各个字段
（不管是私有的还是共有的）
的复制操作封装在了clone()方法中
##### 浅克隆与深克隆
###### 浅克隆（Cloneable原生clone）
被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他
对象的引用仍然指向原来的对象。换言之，浅复制仅仅复制所考虑的对象，
而不复制它所引用的对象。 
###### 深克隆
 被复制对象的所有变量都含有与原来的对象相同的值，
 除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过
 的新对象，而不再是原有的那些被引用的对象。换言之，深复制把要复制
 的对象所引用的对象都复制了一遍。
## 策略模式

#### 结构：
   - 环境(context)角色： 持有一个Strategty的引用
   - 抽象策略（strategy）角色：一个抽象角色，通常一个接口或者抽象类实现。
   - 具体策略（ConcreteStrategy）对象：包装了相应的算法或者行为
#### 认识：
  1. 重心 
   - 策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性。 
  2. 算法平等性
  -  策略模式一个很大的特点就是各个策略算法的平等性。
  - 所有的策略算法在实现上也是相互独立的，相互之间是没有依赖的。
  3. 运行时策略的唯一性
  - 　运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态地在不同的策略实现中切换，但是同时只能使用一个。
##### 优点
   - 策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。
   - 使用策略模式可以避免使用多重条件(if-else)语句。
##### 缺点
   - 客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
   - 由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。   
