　桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦

     在桥接模式结构图中包含如下几个角色：
●Abstraction（抽象类）：用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor
之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
●RefinedAbstraction（扩充抽象类）：扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，
在RefinedAbstraction中可以调用在Implementor中定义的业务方法。
●Implementor（实现类接口）：定义实现类的接口，这个接口不一定要与Abstraction的接口完全一致，事实上这两个接口可以完全不同，一般而言，Implementor接口仅提供
基本操作，而Abstraction定义的接口可能会做更多更复杂的操作。Implementor接口对这些基本操作进行了声明，而具体实现交给其子类。通过关联关系，在Abstraction中不
仅拥有自己的方法，还可以调用到Implementor中定义的方法，使用关联关系来替代继承关系。
●ConcreteImplementor（具体实现类）：具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，在程序运行时，ConcreteImplementor对象
将替换其父类对象，提供给抽象类具体的业务操作方法。

　  实例准备：我们假设有一座桥，桥左边为A，桥右边为B，A有A1，A2，A3等，表示桥左边的三个不同地方，B有B1，B2，B3等，表示桥右边的三个不同地方，
假设我们要从桥左侧A出发到桥的右侧B，我们可以有多重方案，A1到B1，A1到B2，A1到B3，A2到B1...等等，以此为例