## 设计模式GoF

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



### 基础实现

1. Subject接口
2. 真实实现类
3. 代理类

### 论坛权限控制代理

![](https://raw.githubusercontent.com/KongWiki/cloudImg/master/%E8%AE%BA%E5%9D%9B%E6%9D%83%E9%99%90%E6%8E%A7%E5%88%B6%E4%BB%A3%E7%90%86%E7%B1%BB%E5%9B%BE.png)



## reference 

* 图解设计模式
* 设计模式
* 维基百科

