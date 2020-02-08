# 设计模式GoF23

## TODO

* [ ] 单例模式(Singleton Pattern)
* [ ] 原型模式
* [ ] 工厂模式
* [ ] 适配器模式
* [ ] 装饰模式
* [ ] 外观模式
* [x] 代理模式
* [x] 迭代器模式
* [ ] 观察者模式
* [ ] 命令模式

## Iterator模式

![image](https://raw.githubusercontent.com/KongWiki/cloudImg/master/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-iteratorsII.png) 

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



## 代理模式

![](https://raw.githubusercontent.com/KongWiki/cloudImg/master/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F.png)

### 包含角色

1. 代理角色
   1. 代理角色内部包含对真实角色的引入, 可在任何时候对真实角色的引入
   2. 代理还对真实角色加以约束, 其不仅仅是单纯的调用真实角色中的操作,还有其他的操作.
   3. 代理和真实角色都实现了相同的接口
2. 真实角色
3. 抽象主题角色
   1. 也就代理和真实角色共有的操作, 代理和真实角色都是对抽象主题角色的实现

 ![](https://raw.githubusercontent.com/KongWiki/cloudImg/master/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%9E%8B%E7%A4%BA%E6%84%8F%E5%9B%BE.png)



### 基础实现(静态代理)

1. Subject接口

   ```java
   package com.wkk.patterns.proxypattern;
   
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
   package com.wkk.patterns.proxypattern;
   
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
   package com.wkk.patterns.proxypattern;
   
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

![](https://raw.githubusercontent.com/KongWiki/cloudImg/master/%E8%AE%BA%E5%9D%9B%E6%9D%83%E9%99%90%E6%8E%A7%E5%88%B6%E4%BB%A3%E7%90%86%E7%B1%BB%E5%9B%BE.png)

1. AbstractPermission

   ```java
   package com.wkk.patterns.proxypattern.inaction.permission;
   
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
   package com.wkk.patterns.proxypattern.inaction.permission;
   
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
   package com.wkk.patterns.proxypattern.inaction.permission;
   
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

动态代理的角色和静态代理的一样. 主要的区别是, 静态代理中, 代理类是我们提前写好的.与具体实现类是对应的.动态代理的典型应用为Spring AOP .

#### **基于接口动态代理实现**

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

#### **基于类的动态代理实现**





## reference 

* 图解设计模式
* 设计模式
* 维基百科

