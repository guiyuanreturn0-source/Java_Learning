length() : int - 返回字符串长度

isEmpty() : boolean - 判断字符串是否为空（长度为0）

isBlank() : boolean (JDK11+) - 判断字符串是否只包含空白字符

charAt(int index) : char - 返回指定索引处的字符

toCharArray() : char[] - 将字符串转换为字符数组

getBytes() : byte[] - 使用平台默认字符集将字符串编码为字节数组

getBytes(String charsetName) : byte[] - 使用指定字符集将字符串编码为字节数组

equals(Object anObject) : boolean - 比较字符串内容是否相等

equalsIgnoreCase(String anotherString) : boolean - 忽略大小写比较字符串内容

compareTo(String anotherString) : int - 按字典顺序比较两个字符串

compareToIgnoreCase(String str) : int - 忽略大小写按字典顺序比较

startsWith(String prefix) : boolean - 判断字符串是否以指定前缀开头

endsWith(String suffix) : boolean - 判断字符串是否以指定后缀结尾

contains(CharSequence s) : boolean - 判断字符串是否包含指定字符序列

indexOf(int ch) : int - 返回指定字符第一次出现的索引

indexOf(String str) : int - 返回指定子字符串第一次出现的索引

lastIndexOf(int ch) : int - 返回指定字符最后一次出现的索引

lastIndexOf(String str) : int - 返回指定子字符串最后一次出现的索引

concat(String str) : String - 将指定字符串连接到此字符串结尾

substring(int beginIndex) : String - 从beginIndex开始截取到字符串末尾

substring(int beginIndex, int endIndex) : String - 截取指定范围的子字符串

replace(char oldChar, char newChar) : String - 用newChar替换所有oldChar

replace(CharSequence target, CharSequence replacement) : String - 用replacement替换所有target

replaceAll(String regex, String replacement) : String - 用正则匹配并替换所有匹配项

replaceFirst(String regex, String replacement) : String - 用正则匹配并替换第一个匹配项

toUpperCase() : String - 将所有字符转换为大写

toLowerCase() : String - 将所有字符转换为小写

trim() : String - 去除字符串首尾的空白字符（ASCII）

strip() : String (JDK11+) - 去除字符串首尾的空白字符（包括Unicode）

stripLeading() : String (JDK11+) - 去除字符串开头的空白字符

stripTrailing() : String (JDK11+) - 去除字符串结尾的空白字符

repeat(int count) : String (JDK11+) - 将字符串重复count次

split(String regex) : String[] - 使用正则表达式将字符串拆分为字符串数组

split(String regex, int limit) : String[] - 使用正则表达式将字符串拆分为数组，限制拆分次数

join(CharSequence delimiter, CharSequence... elements) : String - 用指定分隔符连接多个字符序列

join(CharSequence delimiter, Iterable<? extends CharSequence> elements) : String - 用分隔符连接可迭代对象中的元素

format(String format, Object... args) : String - 使用指定格式字符串和参数返回格式化字符串

valueOf(Object obj) : String - 返回obj的字符串表示形式

valueOf(char[] data) : String - 返回字符数组的字符串表示形式

valueOf(primitive) : String - 返回基本类型值的字符串表示形式（多个重载）

matches(String regex) : boolean - 判断字符串是否匹配给定的正则表达式

intern() : String - 返回字符串对象的规范表示（从字符串常量池中获取）