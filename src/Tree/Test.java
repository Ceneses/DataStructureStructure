package Tree;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/6/5 16:24
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Node root = new Node(7,"小红");
        Node node1 = new Node(3,"小明");
        Node node2 = new Node(10,"小刚");
        Node node3 = new Node(8,"小美");
        Node node4 = new Node(13,"小喜");
        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node4);
        node2.setLeft(node3);

        BinanryTree binanryTree = new BinanryTree();
        binanryTree.setRoot(root);

        // 7 3 10 8 13
        binanryTree.preOrder();
        Node node = binanryTree.getRoot().preOrderSearch(8);
        System.out.println(node);
    }
}
