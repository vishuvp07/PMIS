/* public class Switch {
    public static void main(String[] args){

        int a = 4;

        switch (a) {
            case 1: 
            System.out.println("Monaday");
            break;
            case 2:
            System.out.println("Thuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("invalid number"); 



            
        }
    }
}
    /* */

public class Switch {
    public static void main (String[] args){
        int a = 20;
        int b = 10;
        int choice = 3;
         int sum = a + b ;
         int sub = a-b;
         int mul = a * b;
         int div = a/b;

         switch(choice){
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(div);
                break;
            default:
                System.out.println("invalid choice");                
         }



    }
}    
