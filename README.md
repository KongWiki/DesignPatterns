# 设计模式GoF23

## TODO

* [x] 单例模式
* [ ] 原型模式
* [x] 工厂模式
* [ ] 适配器模式
* [ ] 装饰模式
* [ ] 外观模式
* [x] 代理模式
* [x] 迭代器模式
* [ ] 观察者模式
* [ ] 命令模式
* [ ] 策略模式
* [ ] 模板模式

## 迭代模式(Iterator Pattern)

![设计模式-iteratorsII.png](https://i.loli.net/2020/04/26/HEtPGIcO2lA9Lzo.png) 

#### 相关角色

* Iterator
  * 负责定义按顺序逐个遍历元素的接口, 包含有`hasNext`和`next`方法, `hasNext`方法用于判断是否存在下一个元素, `next`方法用返回的当前的元素, 并且指向下一个元素
* ConcreteIterator
  * 负责实现Iterator所定义的接口, 此处由BookShelfItrator类 实现
* Aggregate
  * 负责定义创建Iterator的接口
* ConcreteAggregate
  * 负责实现Aggregate定义的接口, 

#### 总结

1. 使用Iterator可以将遍历和实现分离开, 降低耦合性, 例如本例中, 不管BookShelf如何变化, 使用何种数据结构进行存储, 只要能够正确返回Iterator的实例,都能够正确的进行迭代.
2. **不要只使用具体类来编程, 要优先使用抽象类和接口来编程**



## 代理模式(Proxy Pattern)

代理模式使用代理对象完成用户请求，屏蔽用户对真实对象的访问。现实世界的代理人被授权执行当事人的一些事宜，无需当事人出面，从第三方的角度看，似乎当事人并不存在，因为他只和代理人通信。而事实上代理人是要有当事人的授权，并且在核心问题上还需要请示当事人。

![代理模式.png](https://i.loli.net/2020/04/26/NruBRfo4e1saSYj.png)



### 包含角色

1. 代理角色
   1. 代理角色内部包含对真实角色的引入, 可在任何时候对真实角色的引入
   2. 代理还对真实角色加以约束, 其不仅仅是单纯的调用真实角色中的操作,还有其他的操作.
   3. 代理和真实角色都实现了相同的接口
2. 真实角色
3. 抽象主题角色
   1. 也就代理和真实角色共有的操作, 代理和真实角色都是对抽象主题角色的实现

 ![代理模型示意图.png](https://i.loli.net/2020/04/26/SNVFUvjIpMWfmnA.png)



### 使用代理模式的好处：

代理模式的一个好处就是对外部提供统一的接口方法，而代理类在接口中实现对真实类的附加操作行为，从而可以在不影响外部调用情况下，进行系统扩展

### 基础实现(静态代理)

1. Subject接口

   ```java
   package main.com.wkk.design.patterns.proxypattern;
   
   /**
    * @Time: 20-2-8上午10:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public interface Subject {
      void rent();
   }
   
   ```

   

2. 真实实现类

   ```java
   package main.com.wkk.design.patterns.proxypattern;
   
   /**
    * @Time: 20-2-8上午10:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public class User implements Subject {
       @Override
       public void rent() {
           System.out.println("用户我要租房子");
       }
   }
   
   ```

   

3. 代理类

   ```java
   package main.com.wkk.design.patterns.proxypattern;
   
   /**
    * @Time: 20-2-8上午10:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public class UserProxy implements Subject{
       private User user;
   
       public UserProxy(User user) {
           this.user = user;
       }
   
       public void preRent(){
           System.out.println("中介帮客户租房之前, 去找房源");
       }
   
       public void postRent(){
           System.out.println("中介帮客户找到房子, 收取手续费");
       }
   
       @Override
       public void rent() {
           preRent();
           user.rent();
           postRent();
       }
   }
   ```

   

### 论坛权限控制代理(保护代理)

![论坛权限控制代理类图.png](https://i.loli.net/2020/04/26/M6NpKDzr1VEnI9T.png)



1. AbstractPermission

   ```java
   package main.com.wkk.design.patterns.proxypattern.inaction.permission;
   
   /**
    * @Time: 20-2-8上午11:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public interface AbstractPermission {
       // 修改用户信息(需要登录之后)
       void modifyUserInfo();
   
       // 浏览内容
       void viewNote();
   
       // 发布内容
       void publishNote();
   
       // 修改内容
       void modifyNode();
   
       // 登录判断
       void setLevel(int level);
   }
   ```

2. RealPermission

   ```java
   package main.com.wkk.design.patterns.proxypattern.inaction.permission;
   
   /**
    * @Time: 20-2-8上午11:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public class RealPermission implements AbstractPermission {
       @Override
       public void modifyUserInfo() {
           System.out.println("修改用户信息");
       }
   
       @Override
       public void viewNote() {
           System.out.println("查看帖子");
       }
   
       @Override
       public void publishNote() {
           System.out.println("发布一个帖子");
   
       }
   
       @Override
       public void modifyNode() {
           System.out.println("修改一个帖子");
   
       }
   
       @Override
       public void setLevel(int level) {
   
       }
   }
   ```

3. PermissionProxy

   ```java
   package main.com.wkk.design.patterns.proxypattern.inaction.permission;
   
   /**
    * @Time: 20-2-8上午11:06
    * @Author: kongwiki
    * @Email: kongwiki@163.com
    */
   public class PermissionProxy implements AbstractPermission {
       private RealPermission realPermission;
       private int level = 0;
   
       public void setRealPermission(RealPermission realPermission) {
           this.realPermission = realPermission;
       }
   
   
       @Override
       public void modifyUserInfo() {
           if (0 == level) {
               System.out.println("对不起, 你没有权限! 修改用户信息");
           } else if (1 == level) {
               realPermission.modifyUserInfo();
           }
       }
   
       @Override
       public void viewNote() {
           realPermission.viewNote();
   
       }
   
       @Override
       public void publishNote() {
           if (0 == level) {
               System.out.println("对不起, 你没有权限! 发布帖子");
           } else if (1 == level) {
               realPermission.publishNote();
           }
       }
   
       @Override
       public void modifyNode() {
           if (0 == level) {
               System.out.println("对不起, 你没有权限! 修改帖子");
           } else if (1 == level) {
               realPermission.modifyUserInfo();
           }
       }
   
       @Override
       public void setLevel(int level) {
           this.level = level;
       }
   }
   ```

### 动态代理

动态代理的角色和静态代理的一样. 主要的区别是, 静态代理中, 代理类是我们提前写好的.与具体实现类是对应的，动态代理是指在运行时动态生成代理类，也就是代理类的字节码将在运行时生成并载入当前代理的 `ClassLoader`。

#### 动态代理和静态代理的区别：

* 主题接口中的方法很多，为每一个接口写一个代理方法很反人类！！！
* 主题接口有变动，则真实主题和代理类都要修改，不利于系统维护。

语言层面上：

- 静态代理在编译时就已经实现，编译完成后代理类是一个实际的class文件
- 动态代理是在运行时动态生成的，即编译完成后没有实际的class文件，而是在运行时动态生成类字节码，并加载到JVM中

**动态代理特点**：动态代理对象不需要实现接口，但是要求目标对象必须实现接口，否则不能使用动态代理。动态代理的典型应用为Spring AOP，同时通过源码可以发现AOP的基本实现原理有以下的几点：

- 如果针对接口做代理默认使用的是JDK自带的`Proxy`+`InvocationHandler`
- 如果针对类做代理使用的是Cglib
- 即使针对接口做代理，也可以将代理方式配置成走Cglib的

#### **基于接口动态代理实现 --->  JDK动态代理**

JDK动态代理主要涉及两个类：`java.lang.reflect.Proxy` 和 `java.lang.reflect.InvocationHandler`

1. 编写主题

2. 编写真实的角色类

3. 编写动态代理(**核心: InvocationHandler 和Proxy**)

   ```java
   public class DynamicProxy implements InvovationHandler{
       private Object object; // 使用所有的对象
       
       public void setObject(){
           this.object = object;
       }
       
       public void preRequest(){
           ......
       }
       
       public void postRequest(){
           ......
       }    
       /**
    	* @param proxy  代理类
    	* @param method 需要代理的方法
    	* @param args   代理方法的参数
    	* @return
    	* @throws Throwable
    	*/
       @Override
       public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           preRequest();
           // 核心 利用反射实现
       	Object result = method.invoke(object, args);    
           // 代理自身的业务处理
           postRequest();
           return result;
       }
       
       // proxy
       public Object getProxy(){
           return Proxy.newProxyInstance(this.class.getClassLoader(), object.getClass().getInterfaces(), this);
       }
       
   }
   ```

4. Client

   ```java
   RealSubjectB realSubjectB = new RealSubjectB();
   RealSubjectA realSubjectA = new RealSubjectA();
   DynamicProxy proxy = new DynamicProxy();
   // 注入需要的实现类
   proxy.setObject(realSubjectB);
   // 获取相应主题的动态代理
   AbstractSubject proxy1 = (AbstractSubject) proxy.getProxy();
   proxy1.request();
   ```

#### **基于类的动态代理实现 ---> CGLIB动态代理**

~~这个有点儿绕，**待更吧**~~

`cglib`和`Java动态代理`的区别

- 使用动态代理的对象必须实现一个或多个接口
- 使用cglib代理的对象则无需实现接口，达到代理类无侵入。

## 代理模式的应用场合

* 安全代理
  * 用户访问权限控制
* 虚拟代理
  * 应用于需要创建开销很大的对象，通过虚拟代理来存放实例化需要很长时间的真实对象。这样就可以达到性能的最优化，类似网页的图片加载。





## 单例模式(Singleton Pattern)

```java
public class Singleton{
    private static Singleton instance = null;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new new Singleton();
        }
        return instance;
    }
    
}
```

###  模式应用

1. java.lang.Runtime
2. Spring中获取某个类的实例, 默认使用的是单例模式(scope="singleton")

### 拓展

1. 饿汉式单例类

   ```java
   public class Singleton{
       private static Singleton instnce = new singleton();
       ......
       
   }
   ```

   被加载的时候, 静态变量instance会被初始化

2. 懒汉式单例类

   ```java
   public class Singleton{
       private static Singleton instance = null;
       ......
       synchronized public static Singleton getInstance(){
           if(instance == null){
               this.instance  = new singleton();
           }
           return instance;
       }
   }
   ```

   在第一被引用的时候, 将自己实例化.


## 工厂模式(Factory Pattern)

### 简单工厂模式


## 策略模式
目前对策略模式的理解就是属于替代`if/else`的利器。解决的场景，一般是具有同类可替代的行为逻辑算法场景。
譬如不同类型的交易方式（信用卡、支付宝、微信）、生成唯一ID策略（UUID、雪花算法、DB+Redis、Leaf算法、DB自增）等
使用策略模式进行封装，提供给外部的使用（不过对于新增内部同类可替代的行为需要自己去实现）

![image-20210426192951497](https://i.loli.net/2021/04/26/hx8rGUCycQpqfIz.png)



## reference 

* 图解设计模式
* 设计模式 --- 作者 Erich Gamm，Richard Helm，Ralph Johnson，John Vlissides
* 维基百科
* [代理模式原理及实例讲解](https://www.ibm.com/developerworks/cn/java/j-lo-proxy-pattern/index.html)
* 重学Java设计模式·小傅哥



