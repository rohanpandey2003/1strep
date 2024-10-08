//Note:- we can only make one public class in in java and ussi public class me main method
// aega
//Access modifies :-
class employeeDetails{
    int id;
    String name;

}
class employee2Details{
    private int id1;
    private String name1;
    public String getName1(){
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }
}

public class CWH_41 {
    public static void main(String[]args){
        employeeDetails obj1 = new employeeDetails();
        employee2Details obj2 = new employee2Details();
       // obj2.id1 = 12; // yaha pe bhi error because private hai,they are not accesible in other class
        //obj2.name1 = "radhika"; // yaha pe it is showing error
        obj1.id = 43;//but yaha error nai ara
        obj1.name = "rohan pandey";
        obj2.setName1("rohan");
        obj2.setId1(345);
        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj2.getName1());
        System.out.println(obj2.getId1());
    }
}
//agar print statment me bas id likhte aur name likhte toh acces nai hopata because obj he
//acess kr paega usse.
//humlog id1 aur name 1 ko dusre class me acess nai krsakte but main class me toh ofc acess kr sakte hai

