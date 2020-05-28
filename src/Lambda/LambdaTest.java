package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName LambdaTest
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/25 19:44
 * @Version 1.0
 **/

public class LambdaTest {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
        r1.run();

        Runnable r2 = () -> {
            System.out.println("Hello Lambda!");
        };
        r2.run();

        Consumer<String> con = (x) -> {
            System.out.println(x);
        };

        con.accept("韩承毅牛逼~");

        test("HanChengYi", (x) -> {
                System.out.println(x.substring(0,3));
            });

        consumer(100,(x)->{
            System.out.println("今日消费" + x + "元");
        });

        strHH("\t\t\t HanH", (x) -> x.trim());
    }

    public static void test(String str, StringHandler stringHandler){
        stringHandler.getValue(str);
    }

    public static void consumer(Integer x, Consumer<Integer> con){
        con.accept(x);
    }

    public static void strHH(String str, Function<String,String> m){
        System.out.println(m.apply(str));
    }
}
