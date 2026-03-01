currentTimeMillis() long 返回当前时间与1970年1月1日UTC的毫秒差

nanoTime() long 返回当前JVM的高精度时间值（纳秒），用于测量时间间隔

arraycopy(Object src, int srcPos, Object dest, int destPos, int length) void 复制数组

exit(int status) void 终止当前运行的Java虚拟机，0表示正常退出

gc() void 运行垃圾回收器

getProperty(String key) String 获取指定键指示的系统属性

getProperties() Properties 获取当前系统属性

getenv(String name) String 获取指定环境变量值

getenv() Map<String, String> 获取所有环境变量

identityHashCode(Object x) int 返回对象的哈希码，无论是否重写hashCode方法

lineSeparator() String 返回与系统相关的行分隔符字符串

setOut(PrintStream out) void 重新分配标准输出流

setErr(PrintStream err) void 重新分配标准错误输出流

setIn(InputStream in) void 重新分配标准输入流

in InputStream 标准输入流，通常对应键盘输入

out PrintStream 标准输出流，通常对应控制台输出

err PrintStream 标准错误输出流，通常对应控制台错误输出