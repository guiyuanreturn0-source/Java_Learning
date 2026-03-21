java.time.LocalDate

.now(), 无, 获取系统默认时区的当前LocalDate

.of(int year, int month, int dayOfMonth), int year, int month, int dayOfMonth, 根据指定的年月日创建LocalDate

.parse(CharSequence text), CharSequence text, 从ISO格式(如"2026-03-12")的字符串解析为LocalDate

.getYear(), 无, 获取年份

.getMonthValue(), 无, 获取月份(1-12)

.getDayOfMonth(), 无, 获取月份中的天数

.getDayOfWeek(), 无, 获取星期几，返回DayOfWeek枚举

.plusDays(long daysToAdd), long daysToAdd, 返回增加指定天数后的副本

.minusWeeks(long weeksToSubtract), long weeksToSubtract, 返回减去指定周数后的副本

.isBefore(ChronoLocalDate other), ChronoLocalDate other, 检查此日期是否在指定日期之前

.isAfter(ChronoLocalDate other), ChronoLocalDate other, 检查此日期是否在指定日期之后

.atStartOfDay(), 无, 返回此日期在一天开始时的LocalDateTime

.atTime(LocalTime time), LocalTime time, 返回此日期与指定时间组合的LocalDateTime

.with(TemporalAdjuster adjuster), TemporalAdjuster adjuster, 返回调整后的日期副本

.isLeapYear(), 无, 检查年份是否为闰年

.lengthOfMonth(), 无, 返回月份的天数

.lengthOfYear(), 无, 返回年份的天数

java.time.LocalTime

.now(), 无, 获取系统默认时区的当前LocalTime

.of(int hour, int minute), int hour, int minute, 根据指定的时、分创建LocalTime

.of(int hour, int minute, int second), int hour, int minute, int second, 根据指定的时、分、秒创建LocalTime

.of(int hour, int minute, int second, int nanoOfSecond), int hour, int minute, int second, int nanoOfSecond, 根据指定的时、分、秒、纳秒创建LocalTime

.getHour(), 无, 获取小时

.getMinute(), 无, 获取分钟

.getSecond(), 无, 获取秒

.getNano(), 无, 获取纳秒

.plusHours(long hoursToAdd), long hoursToAdd, 返回增加指定小时数后的副本

.plusMinutes(long minutesToAdd), long minutesToAdd, 返回增加指定分钟数后的副本

.minusMinutes(long minutesToSubtract), long minutesToSubtract, 返回减去指定分钟数后的副本

.minusSeconds(long secondsToSubtract), long secondsToSubtract, 返回减去指定秒数后的副本

.isBefore(LocalTime other), LocalTime other, 检查此时间是否在指定时间之前

.isAfter(LocalTime other), LocalTime other, 检查此时间是否在指定时间之后

.truncatedTo(TemporalUnit unit), TemporalUnit unit, 返回截断到指定单位的时间副本

.withHour(int hour), int hour, 返回更改小时后的时间副本

.withMinute(int minute), int minute, 返回更改分钟后的时间副本

java.time.LocalDateTime

.now(), 无, 获取系统默认时区的当前LocalDateTime

.of(LocalDate date, LocalTime time), LocalDate date, LocalTime time, 根据LocalDate和LocalTime创建LocalDateTime

.of(int year, int month, int dayOfMonth, int hour, int minute), int year, int month, int dayOfMonth, int hour, int minute, 根据年月日时分创建LocalDateTime

.of(int year, int month, int dayOfMonth, int hour, int minute, int second), int year, int month, int dayOfMonth, int hour, int minute, int second, 根据年月日时分秒创建LocalDateTime

.toLocalDate(), 无, 提取此日期时间的LocalDate部分

.toLocalTime(), 无, 提取此日期时间的LocalTime部分

.getYear(), 无, 获取年份

.getMonthValue(), 无, 获取月份(1-12)

.getDayOfMonth(), 无, 获取月份中的天数

.getHour(), 无, 获取小时

.getMinute(), 无, 获取分钟

.getSecond(), 无, 获取秒

.atZone(ZoneId zone), ZoneId zone, 将此日期时间与时区组合创建ZonedDateTime

.plusDays(long days), long days, 返回增加指定天数后的副本

.minusHours(long hours), long hours, 返回减去指定小时数后的副本

.isBefore(ChronoLocalDateTime<?> other), ChronoLocalDateTime<?> other, 检查此日期时间是否在指定日期时间之前

.isAfter(ChronoLocalDateTime<?> other), ChronoLocalDateTime<?> other, 检查此日期时间是否在指定日期时间之后

.withYear(int year), int year, 返回更改年份后的副本

.withMonth(int month), int month, 返回更改月份后的副本

.withDayOfMonth(int dayOfMonth), int dayOfMonth, 返回更改月份中日后的副本

java.time.ZonedDateTime

.now(), 无, 获取系统默认时区的当前ZonedDateTime

.now(ZoneId zone), ZoneId zone, 获取指定时区的当前ZonedDateTime

.of(LocalDateTime localDateTime, ZoneId zone), LocalDateTime localDateTime, ZoneId zone, 根据本地日期时间和时区创建ZonedDateTime

.of(LocalDate date, LocalTime time, ZoneId zone), LocalDate date, LocalTime time, ZoneId zone, 根据日期、时间和时区创建ZonedDateTime

.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone), int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone, 根据年、月、日、时、分、秒、纳秒和时区创建ZonedDateTime

.toLocalDateTime(), 无, 转换为此日期时间的LocalDateTime部分（丢弃时区）

.toLocalDate(), 无, 返回此日期时间的LocalDate部分

.toLocalTime(), 无, 返回此日期时间的LocalTime部分

.withZoneSameInstant(ZoneId zone), ZoneId zone, 返回调整到时区后，表示同一瞬间的ZonedDateTime

.withZoneSameLocal(ZoneId zone), ZoneId zone, 返回调整到时区后，保持相同本地时间的ZonedDateTime

.getZone(), 无, 获取时区

.getOffset(), 无, 获取与UTC的偏移量

.isBefore(ChronoZonedDateTime<?> other), ChronoZonedDateTime<?> other, 检查此日期时间是否在指定日期时间之前

.isAfter(ChronoZonedDateTime<?> other), ChronoZonedDateTime<?> other, 检查此日期时间是否在指定日期时间之后

.plusDays(long days), long days, 返回增加指定天数后的副本

.minusHours(long hours), long hours, 返回减去指定小时数后的副本

.withYear(int year), int year, 返回更改年份后的副本

.withMonth(int month), int month, 返回更改月份后的副本

java.time.ZoneId

.of(String zoneId), String zoneId, 根据时区ID（如"Asia/Shanghai"）获取ZoneId对象

.systemDefault(), 无, 获取系统默认时区

.getAvailableZoneIds(), 无, 获取所有可用的时区ID

.ofOffset(String prefix, ZoneOffset offset), String prefix, ZoneOffset offset, 根据偏移量创建ZoneId

.getId(), 无, 获取时区ID字符串

.getRules(), 无, 获取此时区的规则

.normalized(), 无, 返回规范化的时区ID

java.time.Period

.between(LocalDate startDateInclusive, LocalDate endDateExclusive), LocalDate startDateInclusive, LocalDate endDateExclusive, 计算两个日期之间的Period

.getYears(), 无, 获取此期间的年数

.getMonths(), 无, 获取此期间的月数

.getDays(), 无, 获取此期间的天数

.of(int years, int months, int days), int years, int months, int days, 创建表示指定年、月、日的Period

.ofYears(int years), int years, 创建表示指定年数的Period

.ofMonths(int months), int months, 创建表示指定月数的Period

.ofWeeks(int weeks), int weeks, 创建表示指定周数的Period

.ofDays(int days), int days, 创建表示指定天数的Period

.plusYears(long yearsToAdd), long yearsToAdd, 返回增加指定年数后的副本

.plusMonths(long monthsToAdd), long monthsToAdd, 返回增加指定月数后的副本

.plusDays(long daysToAdd), long daysToAdd, 返回增加指定天数后的副本

.minusYears(long yearsToSubtract), long yearsToSubtract, 返回减去指定年数后的副本

.minusMonths(long monthsToSubtract), long monthsToSubtract, 返回减去指定月数后的副本

.minusDays(long daysToSubtract), long daysToSubtract, 返回减去指定天数后的副本

.isZero(), 无, 检查此期间是否为零

.isNegative(), 无, 检查此期间是否为负

.normalized(), 无, 返回标准化的期间（月数调整为0-11）

java.time.Duration

.between(Temporal startInclusive, Temporal endExclusive), Temporal startInclusive, Temporal endExclusive, 计算两个时间点之间的Duration

.toHours(), 无, 获取此持续时间的小时数

.toMinutes(), 无, 获取此持续的分钟数

.toMillis(), 无, 获取此持续的毫秒数

.toNanos(), 无, 获取此持续的纳秒数

.ofHours(long hours), long hours, 创建表示指定小时的Duration

.ofMinutes(long minutes), long minutes, 创建表示指定分钟的Duration

.ofSeconds(long seconds), long seconds, 创建表示指定秒的Duration

.ofMillis(long millis), long millis, 创建表示指定毫秒的Duration

.ofNanos(long nanos), long nanos, 创建表示指定纳秒的Duration

.getSeconds(), 无, 获取此持续时间的秒数

.getNano(), 无, 获取此持续时间的纳秒部分

.plusHours(long hoursToAdd), long hoursToAdd, 返回增加指定小时数后的副本

.plusMinutes(long minutesToAdd), long minutesToAdd, 返回增加指定分钟数后的副本

.minusHours(long hoursToSubtract), long hoursToSubtract, 返回减去指定小时数后的副本

.minusMinutes(long minutesToSubtract), long minutesToSubtract, 返回减去指定分钟数后的副本

.isZero(), 无, 检查此持续时间是否为零

.isNegative(), 无, 检查此持续时间是否为负

.abs(), 无, 返回持续时间的绝对值

.multipliedBy(long multiplicand), long multiplicand, 返回乘以指定标量后的副本

.dividedBy(long divisor), long divisor, 返回除以指定除数后的副本

java.time.Instant

.now(), 无, 获取当前时刻的Instant（UTC）

.ofEpochSecond(long epochSecond), long epochSecond, 根据秒数创建Instant

.ofEpochMilli(long epochMilli), long epochMilli, 根据毫秒数创建Instant

.toEpochMilli(), 无, 转换为自1970-01-01T00:00:00Z的毫秒数

.getEpochSecond(), 无, 获取自1970-01-01T00:00:00Z的秒数

.getNano(), 无, 获取纳秒部分

.atZone(ZoneId zone), ZoneId zone, 将此瞬间与时区组合创建ZonedDateTime

.plusSeconds(long secondsToAdd), long secondsToAdd, 返回增加指定秒数后的副本

.plusMillis(long millisToAdd), long millisToAdd, 返回增加指定毫秒数后的副本

.minusSeconds(long secondsToSubtract), long secondsToSubtract, 返回减去指定秒数后的副本

.minusMillis(long millisToSubtract), long millisToSubtract, 返回减去指定毫秒数后的副本

.isBefore(Instant otherInstant), Instant otherInstant, 检查此瞬间是否在指定瞬间之前

.isAfter(Instant otherInstant), Instant otherInstant, 检查此瞬间是否在指定瞬间之后

.truncatedTo(TemporalUnit unit), TemporalUnit unit, 返回截断到指定单位的副本

.compareTo(Instant otherInstant), Instant otherInstant, 比较两个瞬间

java.time.format.DateTimeFormatter

.ofPattern(String pattern), String pattern, 根据模式字符串创建格式化器

.ofPattern(String pattern, Locale locale), String pattern, Locale locale, 根据模式字符串和区域设置创建格式化器

.format(TemporalAccessor temporal), TemporalAccessor temporal, 将时间对象格式化为字符串

.parse(CharSequence text), CharSequence text, 将字符串解析为时间对象

.parse(CharSequence text, TemporalQuery<T> query), CharSequence text, TemporalQuery<T> query, 将字符串解析为指定类型的时间对象

.ISO_LOCAL_DATE, 无, 预定义的ISO本地日期格式化器

.ISO_LOCAL_TIME, 无, 预定义的ISO本地时间格式化器

.ISO_LOCAL_DATE_TIME, 无, 预定义的ISO本地日期时间格式化器

.ISO_ZONED_DATE_TIME, 无, 预定义的ISO时区日期时间格式化器

.ISO_INSTANT, 无, 预定义的ISO瞬间格式化器

.withZone(ZoneId zone), ZoneId zone, 返回设置时区后的格式化器副本

.withLocale(Locale locale), Locale locale, 返回设置区域设置后的格式化器副本

.withResolverStyle(ResolverStyle resolverStyle), ResolverStyle resolverStyle, 返回设置解析样式后的格式化器副本

.toFormat(), 无, 将此格式化器转换为java.text.Format

.getZone(), 无, 获取格式化器的时区

.getLocale(), 无, 获取格式化器的区域设置

java.util.Date

Date(), 无, 创建表示当前时间的Date对象

Date(long date), long date, 根据指定的毫秒数创建Date对象

.getTime(), 无, 返回自1970年1月1日00:00:00 GMT以来的毫秒数

.setTime(long time), long time, 设置此Date对象表示的时间

.from(Instant instant), Instant instant, 静态方法，从Instant对象创建Date

.toInstant(), 无, 将Date对象转换为Instant

.before(Date when), Date when, 测试此日期是否在指定日期之前

.after(Date when), Date when, 测试此日期是否在指定日期之后

.compareTo(Date anotherDate), Date anotherDate, 比较两个日期的顺序

.equals(Object obj), Object obj, 比较两个日期的相等性

.toString(), 无, 将Date对象转换为字符串表示形式

.toLocaleString(), 无, 创建日期的本地字符串表示（已过时）

.toGMTString(), 无, 创建日期的GMT字符串表示（已过时）

.getYear(), 无, 获取年份（自1900年起的偏移，已过时）

.getMonth(), 无, 获取月份（0-11，已过时）

.getDate(), 无, 获取月份中的天数（已过时）

.getDay(), 无, 获取星期几（0-6，已过时）

.getHours(), 无, 获取小时（已过时）

.getMinutes(), 无, 获取分钟（已过时）

.getSeconds(), 无, 获取秒（已过时）

java.util.Calendar

.getInstance(), 无, 静态方法，获取使用默认时区和地区的Calendar实例

.getInstance(TimeZone zone), TimeZone zone, 静态方法，获取指定时区的Calendar实例

.getInstance(Locale aLocale), Locale aLocale, 静态方法，获取指定区域设置的Calendar实例

.getInstance(TimeZone zone, Locale aLocale), TimeZone zone, Locale aLocale, 静态方法，获取指定时区和区域设置的Calendar实例

.set(int field, int value), int field, int value, 设置给定日历字段的值

.get(int field), int field, 返回给定日历字段的值

.getTime(), 无, 返回表示此Calendar时间值的Date对象

.setTime(Date date), Date date, 用给定的Date设置此Calendar的时间

.add(int field, int amount), int field, int amount, 为指定字段添加或减去时间量

.roll(int field, int amount), int field, int amount, 在指定字段上添加或减去（上滚/下滚）单个时间单元，不更改更大的字段

.getTimeInMillis(), 无, 返回此Calendar的时间值，以毫秒为单位

.setTimeInMillis(long millis), long millis, 用给定的long值设置此Calendar的当前时间

.getTimeZone(), 无, 获取时区

.setTimeZone(TimeZone value), TimeZone value, 设置时区

.getFirstDayOfWeek(), 无, 获取一周的第一天

.setFirstDayOfWeek(int value), int value, 设置一周的第一天

.getMinimalDaysInFirstWeek(), 无, 获取一年中第一周所需的最小天数

.setMinimalDaysInFirstWeek(int value), int value, 设置一年中第一周所需的最小天数

.getActualMaximum(int field), int field, 返回指定日历字段可能拥有的最大值

.getActualMinimum(int field), int field, 返回指定日历字段可能拥有的最小值

.isSet(int field), int field, 检查指定日历字段是否已设置

.clear(), 无, 清除所有日历字段的值

.clear(int field), int field, 清除指定日历字段的值

.YEAR, 无, 表示年份的字段编号

.MONTH, 无, 表示月份的字段编号

.DAY_OF_MONTH, 无, 表示月份中天数的字段编号

.HOUR_OF_DAY, 无, 表示一天中小时数的字段编号（24小时制）

.MINUTE, 无, 表示分钟数的字段编号

.SECOND, 无, 表示秒数的字段编号

.MILLISECOND, 无, 表示毫秒数的字段编号

.DAY_OF_WEEK, 无, 表示一周中天数的字段编号

.AM_PM, 无, 表示上午/下午指示符的字段编号

.HOUR, 无, 表示小时数的字段编号（12小时制）

java.text.SimpleDateFormat

SimpleDateFormat(), 无, 使用默认模式和日期格式符号创建SimpleDateFormat

SimpleDateFormat(String pattern), String pattern, 使用给定模式和默认日期格式符号创建SimpleDateFormat

SimpleDateFormat(String pattern, Locale locale), String pattern, Locale locale, 使用给定模式和给定区域设置的默认日期格式符号创建SimpleDateFormat

SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols), String pattern, DateFormatSymbols formatSymbols, 使用给定模式和日期格式符号创建SimpleDateFormat

.format(Date date), Date date, 将Date格式化为日期/时间字符串

.parse(String source), String source, 从字符串解析生成Date

.parse(String text, ParsePosition pos), String text, ParsePosition pos, 从字符串解析生成Date

.applyPattern(String pattern), String pattern, 将给定模式字符串应用于此日期格式

.toPattern(), 无, 返回描述此日期格式的模式字符串

.setTimeZone(TimeZone zone), TimeZone zone, 设置时区

.getTimeZone(), 无, 获取时区

.setLenient(boolean lenient), boolean lenient, 指定解析是否宽松

.isLenient(), 无, 判断解析是否宽松

.setCalendar(Calendar newCalendar), Calendar newCalendar, 设置日历

.getCalendar(), 无, 获取日历

.setNumberFormat(NumberFormat newNumberFormat), NumberFormat newNumberFormat, 设置数字格式

.getNumberFormat(), 无, 获取数字格式

.clone(), 无, 创建此SimpleDateFormat的副本

.equals(Object obj), Object obj, 比较两个SimpleDateFormat对象的相等性

.hashCode(), 无, 返回哈希码值