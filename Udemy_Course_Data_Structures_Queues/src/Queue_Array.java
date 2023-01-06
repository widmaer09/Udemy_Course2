public class Queue_Array {
    public static void main(String[] args){
        Employee janeJones= new Employee("Jane","Jones",123);
        Employee johnDoe= new Employee("John","Doe",523);
        Employee marySmith= new Employee("Mary","Smith",623);
        Employee mikeWilson= new Employee("Mark","Jones",923);
        Employee billEnd= new Employee("Bill","Jake",1583);



        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();
        queue.remove();
        queue.remove();
        System.out.println("LINE BREAK");
        queue.printQueue();

        System.out.println("LINE BREAK");


        System.out.println(queue.peek());

        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println("LINE BREAK");
        queue.printQueue();

        System.out.println("LINE BREAK");

    }
}
