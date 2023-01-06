public class Double_EmployeeLinked_List {


    private int size;
    private EmployeeNode head;

    private EmployeeNode tail;

    public void addtoFront(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);

        //check to see if list is empty
        if (head==null){
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head=node;
        size++;
    }

    public void addtoEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        //check to see if list is empty
        if (tail == null){
            head= node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
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
            System.out.print("<=>");
            current= current.getNext();
        }
        System.out.println("null");
    }


    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;


        if( head.getNext()==null){
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }



        head= head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious()==null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();

        size--;
        removedNode.setPrevious(null);



        return removedNode;
    }

    public static void main (String[] args){
        Employee janeJones=new  Employee("Jane","Jones",123);
        Employee johnDoe = new  Employee("John","Doe",456);
        Employee marySmith = new Employee("Mary","Smith",789);
        Employee mikeWilson = new Employee("Mike","Wilson",213);

        Double_EmployeeLinked_List list = new Double_EmployeeLinked_List();

        list.addtoFront(janeJones);
        list.addtoFront(johnDoe);
        list.addtoFront(marySmith);
        list.addtoFront(mikeWilson);
        list.printList();
        System.out.println(list.getSize());

        Employee bobBuilder = new Employee("Bob","The Builder",283);

        list.addtoEnd(bobBuilder);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());


        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());




    }
}
