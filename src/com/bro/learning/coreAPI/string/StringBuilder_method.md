StringBuilder 常用方法 (非线程安全，性能高)

StringBuilder() : StringBuilder - 构造空构建器(初始容量16)

StringBuilder(int capacity) : StringBuilder - 构造指定容量的空构建器

StringBuilder(String str) : StringBuilder - 构造初始化为指定字符串的构建器

append(类型 value) : StringBuilder - 追加任何类型数据的字符串表示(多个重载)

insert(int offset, 类型 value) : StringBuilder - 在指定位置插入数据(多个重载)

delete(int start, int end) : StringBuilder - 删除指定范围内的字符

deleteCharAt(int index) : StringBuilder - 删除指定位置的字符

replace(int start, int end, String str) : StringBuilder - 用str替换指定范围内的字符

reverse() : StringBuilder - 反转此字符序列

setCharAt(int index, char ch) : void - 设置指定索引处的字符

charAt(int index) : char - 返回指定索引处的字符

length() : int - 返回长度(字符数)

capacity() : int - 返回当前容量

ensureCapacity(int minimumCapacity) : void - 确保容量至少等于指定最小值

trimToSize() : void - 尝试减少字符序列的存储空间

substring(int start) : String - 返回从start开始到末尾的子字符串

substring(int start, int end) : String - 返回指定范围内的子字符串

indexOf(String str) : int - 返回指定子字符串第一次出现的索引

indexOf(String str, int fromIndex) : int - 从指定索引开始查找，返回第一次出现的索引

lastIndexOf(String str) : int - 返回指定子字符串最后一次出现的索引

lastIndexOf(String str, int fromIndex) : int - 从指定索引开始反向查找，返回最后一次出现的索引

toString() : String - 返回此序列中数据的字符串表示形式