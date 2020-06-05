package HashTable;

/**
 * @ClassName MyHashTable
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/6/5 10:35
 * @Version 1.0
 **/

public class MyHashTable {
    private int size = 0;
    private EmpList[] empLists;

    public MyHashTable(int size) {
        this.size = size;
        this.empLists = new EmpList[size];
        for (int i = 0; i < this.empLists.length; ++i) {
            this.empLists[i] = new EmpList();
        }
    }

    public void add(Emp emp) {
        int addNO = hashFun(emp);
        this.empLists[addNO].add(emp);
    }

    public int hashFun(Emp emp){
        return emp.id % this.size;
    }

    public void traverse(){
        for (int i = 0; i < this.empLists.length; ++i) {
            if(empLists[i] == null){
                return;
            }
            System.out.print("这是第" + i + "条链: => ");
            empLists[i].traverse();
        }
    }

}

class Emp {
    public int id;
    private String name;
    private String address;
    public Emp next;
    public Emp(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.next = null;
    }

    @Override
    public String toString() {
        return new String("ID是: " + this.id + "姓名是: " + this.name + "地址是: " + this.address);
    }
}

class EmpList{
    private Emp head;

    public EmpList(){
        head = null;
    }

    public void add(Emp emp) {
        if(head == null){
            head = emp;
            return;
        }
        Emp curEmp = head;
        while (true) {
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        curEmp.next = emp;
        System.out.println("插入成功");
    }

    public void traverse(){
        Emp curEmp = head;
        if (curEmp == null){
            System.out.println("空");
            return;
        }
        while (true) {
            System.out.println(curEmp);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
    }
}
