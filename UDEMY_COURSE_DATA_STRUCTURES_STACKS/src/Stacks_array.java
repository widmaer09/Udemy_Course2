public class Stacks_array {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane","John",123));
        stack.push(new Employee("John","Doe",1345));
        stack.push(new Employee("Mary","Smith",1443));
        stack.push(new Employee("Mike","Wilson",6723));
        stack.push(new Employee("Bill","End",78923));

        stack.printStack();
       System.out.println( "peek="+stack.peek());

       stack.pop();

        System.out.println( "peek="+stack.peek());
        


    }
    
}
