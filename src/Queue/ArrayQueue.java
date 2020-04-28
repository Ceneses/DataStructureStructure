package Queue;

import java.util.Scanner;

public class ArrayQueue {
    // 描述一个队列的四个要素
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;
    // 构造器
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        rear = -1;
        front = -1;
    }
    // 判满
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    // 判空
    public boolean isEmpty(){
        return front == rear;
    }
    //存入数据
    public void addQueue(int num){
        if(isFull()){
            throw new RuntimeException("队列满了...不能再添加数据");
        }
        arr[++rear] = num;
    }
    // 取出数据
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("数据空了...不能再取数据了");
        }
        return arr[++front];
    }
    // 查看队列头
    public void peek(){
        System.out.println(arr[front + 1]);
    }
    // 显示数据
    public void toShow(){
        for (int i = front + 1; i <= rear; ++i){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue =  new ArrayQueue(3);
        boolean loop = true;
        char key = '\u0000';
        while(loop){
            System.out.println("==========================");
            System.out.println("s(show)");
            System.out.println("a(add)");
            System.out.println("g(get)");
            System.out.println("p(peek)");
            System.out.println("q(quit)");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            key = sc.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.toShow();
                    break;
                case 'a':
                    System.out.println("请输入数值:");
                    int num = sc.nextInt();
                    try {
                        arrayQueue.addQueue(num);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 'g':
                    System.out.println(arrayQueue.getQueue());
                    break;
                case 'p':
                    arrayQueue.peek();
                    break;
                case 'q':
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
