public class EmployeeLinkedList {


    private int size;
    private EmployeeNode head;

    public void addtoFront(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.print("head ->");
        while(current !=null){
            System.out.print(current);
            System.out.print("->");
            current= current.getNext();
        }
        System.out.println("null");
    }


    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;
        head= head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public static void main(String[] args){
        Employee janeJones=new  Employee("Jane","Jones",123);
       Employee johnDoe = new  Employee("John","Doe",456);
        Employee marySmith = new Employee("Mary","Smith",789);
        Employee mikeWilson = new Employee("Mike","Wilson",213);


        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());



        list.addtoFront(janeJones);
        list.addtoFront(johnDoe);
        list.addtoFront(marySmith);
        list.addtoFront(mikeWilson);
        list.printList();
        System.out.println(list.isEmpty());

        System.out.println(list.getSize());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();





    }

}
