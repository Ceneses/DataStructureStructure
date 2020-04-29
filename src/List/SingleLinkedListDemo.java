package List;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(12,null);
        Node node2 = new Node(13,null);
        Node node3 = new Node(14,null);
        Node node4 = new Node(15,null);
        SingleList singleList = new SingleList();
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

    public void list(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp);
            temp = temp.next;
        }
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
