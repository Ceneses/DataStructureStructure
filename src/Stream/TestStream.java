package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName Stream
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/28 23:27
 * @Version 1.0
 **/

public class TestStream {
    public static void main(String[] args) {
        // 1.通过Collection的Stream函数获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // 2.通过Arrays的Stream函数方式获取流
        String[] str = new String[10];
        Stream<String> stream2 = Arrays.stream(str);

        // 3.通过Stream类中的静态方法of()
        Stream<String> stream3 = Stream.of("aa", "bb", "cc");

        // 4.创建无限流
        // 迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10).forEach(System.out::println);
    }
}
