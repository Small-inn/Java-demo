## 注解与反射

---

### 注解
1. 什么是注解
    - JDK5引入的新特性，注解（也称元数据）为我们在代码中添加信息提供了一种形式化的方法，是我们在稍后某个时刻非常方便使用这些数据
    - 注解类型定义指定了一种新的类型，一种特殊的接口类型
    - 在关键字@interface前加@符号，也就是用@interface来区分注解的定义和接口声明
    
2. 作用
    - 提供信息给编译器： 编译器可以利用注解来探测错误和警告信息，如 @Override、@Deprecated
    - 编译阶段的处理： 软件工具可以用来利用注解信息来生成代码、Html 文档或者做其它相应处理，如 @Param、@Return、@See、@Author 用于生成 Javadoc 文档。
    - 运行时的处理：某些注解可以在程序运行的时候接受代码的提取，值得注意的是，注解不是代码本身的一部分。如Spring 2.5 开始注解配置，减少了配置。
    
3. 本质
    - 所有的注解本质都是继承自Annotation接口，但是，手动定义一个接口继承Annotation接口是无效的，需要通过@interface声明注解，Annotation接口本身也不定义注解类型，只是一个普通的接口
    - 通过@interface定义注解后，该注解不能继承其他的注解或者接口，注解是不支持继承的
    
4. 注解的属性
    - 注解的属性也称成员变量，注解只有成员变量，没有方法
        - 所有基本类型（int、float、boolean）
        - String
        - Class
        - enum（@Retention中属性的类型为枚举）
        - Annotation
        - 以上类型的数组
        - ```java
            @interface Reference {
                  boolean contain() default false;
              }
            ```     
          
5. 组成
    ```java
       import java.lang.annotation.Retention;
       import java.lang.annotation.RetentionPolicy;
       @Target(ElementType.TYPE)
       @Retention(RetentionPolicy.RUNTIME)
       public @interface  TestAnnotation {}
    ```
5. 元注解
    - 即注解的注解只能作用于注解上的注解，元注解负责注解其他注解的注解，只能用在注解上
    - @Documented：该注解的使用表示是否包含在生成的Javadoc文档中
    - @Retention：表示需要在什么级别保存该注释信息，用于描述注解的生命周期，取值范围为RetationPolicy枚举，方式如下：
        - @Retention(RetentionPolicy.RUNTIME)
        - @Retention(value = RetentionPolicy.RUNTIME)
        
    - @Target：用于定义注解能使用的范围，方式如下：
        - @Target(ElementType.METHOD)
        - @Target(value = ElementType.METHOD)
        - @Target({ElementType.METHOD, ElementType.TYPE})
        - @Target(value = {ElementType.METHOD, ElementType.TYPE})
    - @Inherited：该注解表示注解是否具有继承的特性,说明子类可以继承父类中的该注解
    
6. 标准注解（内置注解）
    - @Deprecated：不鼓励使用
        - 当在不推荐使用的代码中使用或覆盖不推荐使用的程序元素时，编译器会发出警告。该注解可以用来修饰构造器、字段、局部变量、方法等类型。
    - @Override
        - 提示子类需要重写父类的方法。方法重写或实现了在父类中声明的方法时需要加上该注解，该注解用于编译器检查重写的操作是否正确，保留策略为 RetentionPolicy.SOURCE。
    - @SuppressWarnnings
        - 用来关闭编译器生成警告信息，可以用来修饰类、方法、成员变量等，在使用该注解时，应采用就近原则，如方法产生警告是，应该针对方法声明该注解，而不是对类声明，有利于发现该类的其他警告信息。
    
7. 自定义注解
    - @interface用来声明一个注解，格式：public @interface 注解名{定义内容}
    - 其中的没一个方法实际上是声明了一个配置参数
    - 方法的名称就是参数的名称
    - 返回值类型就是参数的类型（返回值只能是基本类型，class，String，enum）
    - 可以通过default来声明参数的默认值
    - 如果只有一个参数成员，一般定义为value
    - 注解元素必须要有值，我们定义注解元素时，经常使用空字符串0作为默认值
    ```java
       import java.lang.annotation.ElementType;
       import java.lang.annotation.Retention;
       import java.lang.annotation.RetentionPolicy;
       import java.lang.annotation.Target;
       @Retention(RetentionPolicy.RUNTIME)
   //  runtime > class > sources 
       @Target({ElementType.METHOD})
       public @interface MyBean {
           String value() default "";
       }   
   ```
### 反射（Reflection）
1. 什么是反射机制
    - Java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法，对于任意个对象，都能够调用他的任意一个方法和属性，这种动态获取的信息以及动态调用对象的方法的功能
    
2. class类并获取class实例
    - 若已知集体的类，通过类的class属性获取，该方法最为安全可靠，性能最高
    - 已知某个类的实例，调用该实例的getClass()方法获取Class对象
    - 已知一个类的全名，且该类在类的路径下，可通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException
    - 内置基本数据类型可以直接使用类名.Type
    - ClassLoader
3. 类的加载与ClassLoader
    - 类的加载（load）===> 类的链接（link）===> 类的初始化（initialize）
    - load阶段：将类的class文件读入内存，并为之创建一个java.lang.Class对象
    - link阶段：将类的二进制数据合并到JRE中
    - initialize阶段：JVM负责对类进行初始化 
4. 创建运行时类的对象
    -  通过反射获取运行时类的完整结构
        * Field、Method、Constructor、Superclass、Interface、Annotation
    
5. 获取运行时类的完整结构
6. 调用运行时的指定结构


