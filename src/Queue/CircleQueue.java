package Queue;

import java.util.Scanner;

/**
 * 环形队列：
 * front的定义：下一个取出的位置
 * rear的定义：下一个存放的位置
 * 1.初始位置 rear = 0, front = 0
 * 2.判空条件: rear == front
 * 3.必须空出一个位置存放 0
 */
public class CircleQueue {
    private int rear;
    private int front;
    private int maxSize;
    private int[] arr;

    public CircleQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        rear = 0;
        front = 0;
    }

    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void addQueue(int num){
        if(isFull()){
            throw new RuntimeException("队列满了...不能再添加数据");
        }
        arr[rear] = num;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("数据空了...不能再取数据了");
        }
        int value = arr[front];
        arr[front] = 0;
        front = (front + 1) % maxSize;
        return value;
    }

    public void peek(){
        System.out.printf("arr[%d]:%d\n", front, arr[front]);
    }

    public void toShow(){
        if (isEmpty()){
            System.out.println("没有数据");
            return;
        }
        for (int i = front; i <= front + size(); ++i){
            System.out.printf("arr[%d]:%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    public void getFront(){
        System.out.println(this.front);
    }

    public void getRear(){
        System.out.println(this.rear);
    }

    public static void main(String[] args) {
        CircleQueue circleQueue =  new CircleQueue(4);
        boolean loop = true;
        char key = '\u0000';
        while(loop){
            System.out.println("==========================");
            System.out.println("s(show)");
            System.out.println("a(add)");
            System.out.println("g(get)");
            System.out.println("p(peek)");
            System.out.println("q(quit)");
            System.out.println("f(front)");
            System.out.println("r(rear)");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            key = sc.next().charAt(0);
            switch (key){
                case 's':
                    circleQueue.toShow();
                    break;
                case 'a':
                    System.out.println("请输入数值:");
                    int num = sc.nextInt();
                    try {
                        circleQueue.addQueue(num);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    System.out.println(circleQueue.getQueue());
                    break;
                case 'p':
                    circleQueue.peek();
                    break;
                case 'q':
                    loop = false;
                    break;
                case 'f':
                    circleQueue.getFront();
                    break;
                case 'r':
                    circleQueue.getRear();
                    break;
                default:
                    break;
            }
        }
    }
}
