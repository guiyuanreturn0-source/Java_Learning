StringJoiner 常用方法(JDK8+, 用于连接字符串)

StringJoiner(CharSequence delimiter) : StringJoiner - 使用指定分隔符(无前后缀)

StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix) : StringJoiner - 使用分隔符、前缀和后缀

add(CharSequence newElement) : StringJoiner - 添加一个新元素

merge(StringJoiner other) : StringJoiner - 合并另一个StringJoiner的内容

setEmptyValue(CharSequence emptyValue) : StringJoiner - 设置没有元素时的默认值

length() : int - 返回长度(包括前后缀和分隔符)

toString() : String - 返回当前值的字符串表示形式