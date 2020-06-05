package Strategy;

/**
 * @ClassName Dog
 * @Description //TODO
 * @Author Han ChengYifor
 * @Date 2020/5/29 10:02
 * @Version 1.0
 **/

public class Dog implements Comparable {
    int age = 10;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Dog)) {
            throw new RuntimeException("传入数据类型错误！");
        }
        Dog a = (Dog) o;
        if(this.age < a.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
