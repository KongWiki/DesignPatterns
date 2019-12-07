## 设计模式

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

## reference 

* 图解设计模式
* 设计模式
* 维基百科

