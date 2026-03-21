# 异常!

![屏幕截图 2026-03-21 183214.png](%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202026-03-21%20183214.png)

常用的其实就是Exception

## 异常分为两种 编译时异常和运行时异常

前者在编写代码时会提示,后者在运行过程中产生

在不使用异常处理时,JVM自动处理异常,在异常处直接停止代码的运行

使用try-catch捕获异常后,try中发生异常后会直接跳转到对应的catch代码块中
```java
try{
    // 可能发生异常的代码
        }catch(/*异常类及其子类*/){
    // 发生异常后的代码
        }catch(/*一个try可以匹配多个catch异常类,从上到下,因此一般把父类放在下*/){
    
        }catch(/*如果是处理逻辑相同的不同逻辑,也可以使用 | 来连接*/){

        }finally{// 如果有必须执行的代码,可以使用finally
    // 一定会执行的代码
        }
```
catch后的代码依然会运行
## 抛出异常
使用throw 和 throws 把异常抛给调用者
```java
void process2(String s) {
    if (s==null) {
        NullPointerException e = new NullPointerException();
        throw e;
    }
}

```
调用printStackTrace()可以打印异常的传播栈,对于调试非常有用;
## 自定义异常
![屏幕截图 2026-03-21 185612.png](%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202026-03-21%20185612.png)
尽量使用Java已有的异常,如果实在没有,可以自定义异常
```java
public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

```
