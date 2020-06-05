package HashTable;

import java.util.Scanner;

/**
 * @ClassName Demo
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/6/5 11:09
 * @Version 1.0
 **/

public class Demo {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(7);
        Scanner sc = new Scanner(System.in);
        String key = "";

        while (true) {
            System.out.println("     add:添加员工");
            System.out.println("traverse:遍历员工");
            System.out.println("    exit:退出系统");
            key = sc.next();
            switch (key) {
                case "add":
                    System.out.println("请输入ID:");
                    int id = sc.nextInt();
                    System.out.println("请输入姓名:");
                    String name = sc.next();
                    System.out.println("请输入地址:");
                    String address = sc.next();
                    Emp emp = new Emp(id, name, address);
                    myHashTable.add(emp);
                    break;
                case "traverse":
                    myHashTable.traverse();
                    break;
                case "exit":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
