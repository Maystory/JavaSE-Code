
# Java SE 的代码与笔记

----------

## *[ReadMe部分没有代码,代码都在项目文件中]*

----------------

 
## [Java多线程核心编程技术] 书籍笔记

### 第一章:Java多线程技能
 - 线程是进程中的子任务
 - interrupted与isInterrupted的区别:
   > - interrupted是Thread类的静态方法,里面调用了isTnterrupted方法[currentThread().isInterrupted()],测试当前线程是否已经中断,线程的中断状态由该方法清除
   > - isInterrupted是Thread类的实例方法,不清除中断标志
   
 - yield方法是放弃当前的CPU时间片资源,让其他的线程去获取资源
 - 线程的优先级越高,线程的执行概率越大
 - 只要当前JVM实例中存在任何一个非守护线程在没有结束,守护线程就在工作.守护线程的作用就是为其他的非守护线程提供便利服务
 
### 第二章:对象及变量的并发访问
 - 只有共享的资源读写才需要同步化
 - 方法中的变量不存在非线程安全的问题
 - 哪个线程先执行带有synchronized关键字的方法,哪个对象就拥有该方法所属对象的锁Lock
 - 当A线程调用anyObject对象加入synchronize关键字的X方法时,A线程就获得了X方法锁(对象锁),其他线程必须等待A线程执行完毕后才可以调用X方法,但是B线程可以随意的调用其他非synchronized同步方法.
 - 可重入锁:自己可以再次获得自己的内部锁,比如有一个线程获得了某个对象的锁,此时这个对象锁还没有释放,当其再次想要获得这个对象的锁的时候还是可以获取的,如果锁不可以重入的话,就会造成死锁.(也支持父子类继承的环境中)
 - 出现异常,锁自动释放
 - 同步不具有继承性
 #### 将任意对象作为监视器
   - 多个线程调用同一个对象中的不同名称的synchronized同步方法或synchronized(this)同步代码块时,是同步的(阻塞的)
   
  1.synchronized同步方法:
   
   - 对其他synchronized同步方法或同步代码块调用呈阻塞状态
   - 同一时间只有一个线程可以执行synchronized同步方法中的代码
   
  2.同步代码块:
  
   - 对其他synchronized同步方法或同步代码块调用呈阻塞状态
   - 同一时间只有一个线程可以执行synchronized同步代码块中的代码
  

-----------------------


 - 在多个线程持有"对象监视器"为同一个对象的前提下,同一时间只有一个线程可以执行synchronized(非this对象x)同步代码块中的代码.
 - 锁非this对象的优点:如果一个类中存在多个synchronized方法,这时虽然能实现同步,但是会阻塞,若使用代码块锁非this对象,则synchronized代码块中的程序与同步方法时异步的,不与其他锁this同步方法争抢this锁
 
 #### synchronized(非this对象x)3个结论
   1. 当多个线程同时执行synchronized同步代码块时呈同步效果
   2. 当其他线程执行x对象中synchronized同步方法时呈同步效果
   3. 当其他线程执行x对象方法synchronized(this) 代码块时呈同步效果
   
-------------------------

  - 静态同步synchronized方法和synchronized(class) 相当于锁这个类(所有对象都被锁)
  - String类有常量池特性,不好用于锁对象
  - 线程互相等待容易造成死锁
  - volatile关键字的作用是强制的从公共堆栈中获取变量的值,而不是从线程的私有数据栈中获取(最致命的在于不支持原子性),对于volatile修饰的变量,JVM虚拟机只是保证从主内存加载到线程工作内存的值是最新的.

  - volatile是线程同步的轻量级实现,volatile修饰变量,synchronized修饰方法和代码块,多线程访问volatile不会发生阻塞而synchronized会.volatile能保证数据的可见性,但是不能保证原子性,synchronized能保证原子性,也可以间接保证可见性,因为它会将私有内存和公有内存中的数据做同步.
  - volatile是解决变量在多个线程之间的可见性;synchronized解决的是多个线程之间访问资源的同步性
  - 原子类也不完全安全

 ### 第三章:线程间通信
  - wait()方法执行完毕释放锁,而notify()
 
 
 
 ## [Java8新特性笔记]
  ### Java8概览:
   ![](https://github.com/Maystory/JavaSE-Code/blob/master/res/Java8.jpeg)
    
   #### 1,函数式接口:
   
   > 所谓的函数式接口,就是只有一个方法的接口,做好加上@Function注解
    
   - Java8中提供的函数式接口:  
   ![](https://github.com/Maystory/JavaSE-Code/blob/master/res/1.jpeg)
    
   注:原始特性类化是指消除自动装箱和拆箱的性能开销提供的基本类型的接口
   
   
   ### 2,lambda表达式和方法引用:
   
   ### 3,Stream(并行流和串行流):
   ![](https://github.com/Maystory/JavaSE-Code/blob/master/res/2.jpeg)
   
   ### 4,接口中的默认方法:
   
   - 
   ### 5,Optional:
   ![](https://github.com/Maystory/JavaSE-Code/blob/master/res/3.jpeg)
   
   ### 6，新的时间和日期API:
   
   
   

    
    