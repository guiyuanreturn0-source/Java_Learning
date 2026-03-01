Random() 无 创建一个新的随机数生成器

Random(long seed) 无 使用指定种子创建随机数生成器

nextInt() int 返回下一个伪随机int值，均匀分布在int范围内

nextInt(int bound) int 返回0（包括）到指定值（不包括）之间的随机int

nextLong() long 返回下一个伪随机long值

nextFloat() float 返回0.0到1.0之间的随机float

nextDouble() double 返回0.0到1.0之间的随机double

nextBoolean() boolean 返回下一个伪随机boolean值

nextBytes(byte[] bytes) void 生成随机字节并填充到字节数组

nextGaussian() double 返回下一个服从高斯（正态）分布的double值

setSeed(long seed) void 使用单个long种子设置随机数生成器的种子

ints(long streamSize, int randomNumberOrigin, int randomNumberBound) IntStream 返回指定数量的随机int流

ints(int randomNumberOrigin, int randomNumberBound) IntStream 返回无限的随机int流

longs(long streamSize, long randomNumberOrigin, long randomNumberBound) LongStream 返回指定数量的随机long流

doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) DoubleStream 返回指定数量的随机double流

doubles(double randomNumberOrigin, double randomNumberBound) DoubleStream 返回无限的随机double流