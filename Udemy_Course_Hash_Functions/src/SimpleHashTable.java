public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredEmployee[10];
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey== hashtable.length-1){
                hashedKey =0;
            }else{
                hashedKey++;
            }
            while(occupied(hashedKey)&& hashedKey != stopIndex){
                hashedKey = (hashedKey+1) % hashtable.length;
            }

        }
        if (occupied(hashedKey)){
            System.out.println("spots full bud");
        }else{
            hashtable[hashedKey]=new StoredEmployee(key,employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] !=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while ( hashedKey != stopIndex && hashtable[hashedKey] !=null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        } else{
            return -1;
        }




    }

    public Employee remove(String key){
        int hashedKey= findKey(key);
        if(hashedKey ==-1){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey]= null;
        return employee;
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printHashtable(){
        for(int i = 0;i< hashtable.length;i++){
            if (hashtable[i] == null){
                System.out.println("empty");

            }else {
                System.out.println(hashtable[i].employee);
            }

        }
    }

    public static void main(String[] args){

        Employee janeJones= new Employee("Jane","Jones",123);
        Employee johnDoe= new Employee("John","Doe",523);
        Employee marySmith= new Employee("Mary","Smith",623);
        Employee mikeWilson= new Employee("Mike","Wilson",923);
        Employee billEnd= new Employee("Bill","End",1583);


        SimpleHashTable ht = new SimpleHashTable();

        ht.put("jones",janeJones);
        ht.put("john",johnDoe);
        ht.put("mary",marySmith);
        ht.put("mark",mikeWilson);
        ht.put("bill",billEnd);

        ht.remove("bill");

        ht.printHashtable();

        System.out.println(ht.get("mary"));






    }
}
