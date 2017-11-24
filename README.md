
# Java SE 的demo代码与笔记

## [Java多线程核心编程技术] 书籍笔记

### 第一章:Java多线程技能
 - 线程是进程中的子任务
 - interrupted与isInterrupted的区别:
   > - interrupted是Thread类的静态方法,里面调用了isTnterrupted方法[currentThread().isInterrupted()],测试当前线程是否已经中断,线程的中断状态由该方法清除
   > - isInterrupted是Thread类的实例方法,不清除中断标志
   
 - yield方法是放弃当前的CPU时间片资源,让其他的线程去获取资源
 - 线程的优先级越高,线程的执行概率越大
 - 只要当前JVM实例中存在任何一个非守护线程在没有结束,守护线程就在工作.守护线程的作用就是为其他的非守护线程提供便利服务
 - 
 
 
 
 ## [Java8新特性笔记]
  ### Java8概览:
    ![]()