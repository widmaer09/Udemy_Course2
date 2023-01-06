import java.util.ArrayList;
import java.util.List;

public class Array_Lists {
    /*
    * List is  abstract data type
    * interface involved
    *dictates operations that can be performed not how data is organized
    * usually just an interface
    *good for random access
    * not good for:move is expensive
    * insertion
    * removals
    * access the array if u dont have the spot it is in the line
    *
    *
    *
    *
    * */

    public static void main(String[] args) {


        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("John","Doe",456));
        employeeList.add(new Employee("Mary","Smith",789));
        employeeList.add(new Employee("Mike","Wilson",213));



        //print each employee in the list
        employeeList.forEach(employee -> System.out.println(employee));


        //get the employee of a specified index
        System.out.println(employeeList.get(1));


        //is it emplty
        System.out.println(employeeList.isEmpty());




        System.out.println(employeeList.set(0,new Employee("John","Adams",4568)));

        System.out.println(employeeList.size());
        employeeList.forEach(employee -> System.out.println(employee));

        //add new employee
        employeeList.add(new Employee("example1","example last",777));


        //search for an employee

        System.out.println(employeeList.contains(new Employee("Mary","Smith",789)));

        System.out.println(employeeList.indexOf(new Employee("John","Doe",456)));

        //remove an employee

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


    }
}
