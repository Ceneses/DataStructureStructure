package List;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(12,null);
        Node node2 = new Node(13,null);
        Node node3 = new Node(14,null);
        Node node4 = new Node(15,null);
        SingleList singleList = new SingleList();
//        singleList.addByOrder(node1);
//        singleList.addByOrder(node2);
//        singleList.addByOrder(node2);
//        singleList.addByOrder(node4);
//        singleList.addByOrder(node3);
//        singleList.list();

        singleList.add(node1);
        singleList.add(node2);
        singleList.add(node3);
        singleList.add(node4);
        singleList.list();
    }
}

class SingleList{
    private Node head = new Node(0,null);
    public SingleList() {

    }

    public void add(Node node){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByOrder(Node node){
        Node temp = head;
        boolean flag = false; //代表着插入元素在单链表中是否存在相同的元素
        // 找到插入点
        while(temp.next != null){
            if(temp.next.data > node.data){
                break;
            }else if(temp.next.data == node.data){
                flag = true;
                break;
            }else{
                temp = temp.next;
            }
        }
        // 插入数值
        if(flag){
            System.out.println(node+"元素已经存在，无法插入");
        }else{
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void list(){
        Node temp = head; // 代表着当前节点
        while(temp.next != null){ // 最后的一个节点是没有进入while循环体
            System.out.println(temp);
            temp = temp.next;
        }
        // 最后的一个节点也要记得输出和打印
        System.out.println(temp);
    }
}

class Node{
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
