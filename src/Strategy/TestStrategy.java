package Strategy;

/**
 * @ClassName TestStrategy
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/29 10:06
 * @Version 1.0
 **/

public class TestStrategy {
    public static void main(String[] args) {
        Dog a = new Dog(29);
        Dog b = new Dog(10);
        System.out.println(a.compareTo(b));
    }
}
