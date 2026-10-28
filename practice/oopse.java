/*class Mobile{
    String Brand;
    int price;
    int ram;


    void displayDetails(){;

    System.out.println(Brand);
    System.out.println(price);
    System.out.println(ram);

}
}

public class oopsex {
    public static void main(String [] args){

    Mobile M1 = new Mobile();

    M1.Brand = "Samsung";
    M1.price = 500000;
    M1.ram = 14;


    Mobile M2 = new Mobile();

    M2.Brand = "Apple";
    M2.price = 5500000;
    M2.ram = 8;


    M1.displayDetails();
    M2.displayDetails();

    
}
}*/

class Employee{

     String name;
    int id;
    int salary;


    void displayDetails(){

    System.out.println(name);
    System.out.println(id);
    System.out.println(salary);
    }
    int anualsalary(){
        return salary * 12;
    }
}
    public class oopse{
public static void main(String[] args){
        Employee E1 = new Employee();
        

        E1.name = "Rahul";
        E1.id = 01;
        E1.salary = 50000;

        E1.displayDetails();
        System.out.println(E1.anualsalary());

        Employee E2 = new Employee();

        E2.name = "Ravi";
        E2.id = 02;
        E2.salary = 60000;

        E2.displayDetails();
        System.out.println(E2.anualsalary());
}
    }



