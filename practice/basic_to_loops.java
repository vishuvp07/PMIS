package practice;

public class basic_to_loops {

   /*  // Swaping of two numbers

   public static void main(String[] args){
    int a = 10;
    int b = 20;

    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping a = "+ a + " b = " + b);
   } */

    //Check whether a number is positve or negative
    /*public static void main(String[] args){
        int num = -12;

        if(num >0){
            System.out.println("the number is positive ");
        }else if (num < 0){
            System.out.println("the number is negative");
        } else{
            System.out.println("the number is zero");
        }
    }*/

        //Find the largest of two numbers
       /*  public static void main(String[] args){
            int a = 25;
            int b = 60;

            if(a > b ){
                System.out.println("a is grether than b");
            }else if (a <b){
                System.out.println(" b is grether than a");
            }else{
                System.out.print("both are equal");
            }
        }*/

            //Find the largest of three numbers

           /*  public static void main (String[] args){
                int a = 30;
                int b= 85;
                int c = 10;

                if(a > b &&  a> b){
                    System.out.println(" a is grether than b and c");   
                }else if(b > a&& b >c){
                    System.out.println(" b is greather than a and c");
                }else if(c > a && c > b){
                    System.out.println(" c is greather than a and b");
                } else{
                    System.out.println("all are equal");
                }
            }*/

                //Check wether a person is eligible to vote or not

                /*public static void main(String[] args){
                    int age = 10;

                    if(age >= 18){
                        System.out.println("the person is eligible to vote");
                    }else {
                        System.out.println("the person is not eligible for vote");
                    }
                }*/

                //check weather the year is leap year

                /*public static void main(String[] args){
                    int year = 2026;

                    if (year % 400 == 0) {
                        System.out.print("the year is leap year");
                    }else if (year % 4 == 0) {
                        System.out.println(" leap year");
                    }
                    else if (year % 100 == 0) {
                        System.out.println("not leap year");
                    } else{
                        System.out.println("not leap year");
                    }
                }*/


    //Q1;- using switch statement perform the addition, subratio, multipication and division
    
    /*public static void main(String[] args){
        int a = 10;
        int b = 20;
        char operator = '+';

        switch (operator){
            case '+':
            System.out.println("result" + (a + b));
            break;

            case '-':
                System.out.println("result " + (a - b));
                break;

            case '*':
                System.out.println("result " + (a * b) );
                break;
              
            case '/':
                System.out.println("result " + (a  / b));  
                break;
            default:
                System.out.println("invalid operator");      


        } 
    }*/
   //Day od the week using switch statement
   /*  public static void main (String[] args){
        int day = 3;

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            
            case 2 :
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wenesday");
                break;

            case 4:
                System.out.println("thursday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;   

        }

    }*/

        //Q2 :- Vowel or consonant using Switch statement

        /*public static void main(String[] args){
            char ch = 'k';

            switch (ch){
                case 'a':
                    case 'e':
                        case 'i':
                            case 'o':
                                case 'u':
                                    System.out.println("Vowel");
                                    break;
                                    default:
                                        System.out.println("Consonant");

            }
        }*/

            // month name using switch 

           /*  public static void main(String[] args){
                int month = 10;

                switch(month){
                    case 1 :
                        System.out.println("JAN");
                        break;
                    
                    case 2 :
                        System.out.println("FEB");
                        break;
            
                    case 3 :
                        System.out.println("MAR");
                        break;
                
                    case 4 :
                        System.out.println("APR");
                        break;
                
                    case 5 :
                        System.out.println("MAY");
                        break;
                
                    case 6 :
                        System.out.println("JUNE");
                        break;
              
                    case 7 :
                        System.out.println("July");
                        break;
                
                    case 8 :
                        System.out.println("AUS");
                        break;
                
                    case 9 :
                        System.out.println("SEP");
                        break;
               
                    case 10 :
                        System.out.println("OCB");
                        break;
                
                    case 11 :
                        System.out.println("NOV");
                        break;

                
                    case 12 :
                        System.out.println("DEC");
                        break;
                
                    default:
                       System.out.println("invaild");
                
                }
            
        } */

                //Even or odd using Switch statement

               /* public static void main(String[] args){

                    int num = 7;
                    
                    

                    switch(num % 2){
                        case 0:
                            System.out.println("even");
                            break;
                        
                        case 1:
                            System.out.println("odd");
                            break;
                        default:
                            System.out.println("invalid");    
                    }
                    }*/
// add calculation using switch statemnet
    /*public static void main(String [] args){
                        int a  = 01;
                        int b = 20;
                        char operator = '+';

                        switch (operator) {
                            case '+':
                                System.out.println("the operation of a and b is " + (a + b) );
                                break;
                        
                            default:

                                break;
                        }

                    }*/

                        // number of days in month using switch statemnets
                   /* public static void main(String[] args){
                    int month = 2;

                    switch(month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        System.out.println("31 days");
                        break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                        System.out.println("30 days");
                        break;
                        
                        case 2:
                            System.out.println("28 days");
                            break;
                        
                        default:
                            System.out.println("invalid month");    

                    }

                   }
                    */

                   //Area of square,circle, rectangle using switch

                  /*  public static void main(String[] args){
                    int side = 52;
                    int choice = 3;
                    int radius = 5;
                    int len = 12;
                    int width = 6;

                    switch (choice) {
                        case 1 :
                            int area = side * side;
                            System.out.println("the area of side is " + area);
                            break;

                        case 2:
                            int circle  =  (int)(Math.PI * radius * radius);
                            System.out.println("the radius of circle is " + circle); 
                            break;

                        case 3 :
                            int rectangle = len * width;
                            System.out.println("the size of rectangle is " + rectangle);
                            break;
                        
                        default:
                            System.out.println("invalid");  
                            break;
                    }
                   }
                    */

       // Traffic signal using switch statement
       
       /*  public static void main(String[] args){
        String signal = "yellow";

        switch (signal) {
            case "red":
                System.out.println("Stop the signal is " + signal);
                break;
            
            case "yellow":
                System.out.println("wait the signal is " + signal);
                break;
            
            case "green":
                System.out.println("Go the signal is " + signal);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
       } */

       // Grade message  using switch Statement

       /*public static void main(String[] args){
        String grade = "c";

        switch(grade){
            case "A":
                System.out.println("OutStanding");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "c":
                System.out.println("Average");
                break;
            default:
                System.out.println("fail");         
        }
       }
        */

     // min ATM using switch statement
       /*public static void main(String []args){
           int choice = 3;
           int balance = 50000;
           int deposit = 2000;
           int withdraw = 3000;
           deposit = balance + deposit;
           withdraw = deposit - withdraw;


           switch(choice){
            case 1:
                System.out.println("Your balance" + balance);
                break;

            case 2:
                System.out.println("Updated amount is " + deposit);
                break;
            
            case 3:
                System.out.println("balance after withdraw amount is "+ withdraw);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("invalid");     

           }

       }
           */


    /*public static void main(String[] args){
        int choice = 2;
        double value = 5;

        switch (choice) {
            case 1:
                System.out.print("the value of 5 Kilometer to meter is "+ (value * 1000));
                break;

             case 2:
                System.out.println("the value of 5 meter in centimeter is " + (value * 100));   
                break;

             case 3:
                System.out.println("the value of 5 Kilogram in gram is " + (value * 1000));
                break;    
            default:
                System.out.println("invalid");
                break;
        }
    }*/

// for loop printing form 1 to 10 //

/*public static void main(String[] args){

   
    for(int i=1; i<=10; i++){
        if(i == 5){
            continue;
        }
        System.out.println(i);
    
    }
}*/

// print the even number from 1 to 10

/*public static void main(String[] args){

    for(int i=1; i<=10; i++){
        if(i % 2 ==0){
            System.out.println(i);
        }

    }


}
    */





//sum of 10 numbers
/*public static void main(String[] args){
    
    int sum = 0;

    for(int i = 1; i<=10; i++){
        sum = sum + i;
        System.out.println(sum);
        }

    
}*/

//Multipication using for loop of 5

/*public static void main(String[] args){

    int num = 5;
    for(int i=1; i<=10; i++){
       
        System.out.println( num + " x " + i + " = "+ ( num*i ));
    }
}
*/

//Write a Java program to count how many numbers from 1 to 20 are divisible by 3.
/*public static void main(String[] args){

    int count = 0;

    for(int i=1; i<=20; i++){
        if(i % 3 ==0){
            count++;
        }
    }
    System.out.println(count);
}*/

//Write a Java program to count how many even numbers are between 1 and 20.

/*public static void main(String[] args){
     int count = 0;

     for(int i = 1; i<=20 ; i++){
        if(i % 2 ==0){
            count++;
        }
     }
     System.out.println(count);
}*/

// Count Odd Numbers
/*public static void main(String[] args){
    int count = 0;

    for(int i=1; i<=50; i++){
        if(i % 2 != 0){
            count++;

        }
    }
   System.out.println(count);
}*/

//Count Numbers Divisible by Both 3 and 5
/*public static void main(String[]args){

    int count = 0;

    for(int i=1; i<=100; i++){
        if(i%3 == 0 && i%5 ==0){
            count++;
            
        }
    }
     System.out.println(count);

}*/

//Count Positive Numbers in a Range (Write a Java program to count how many numbers between 1 and 100 are divisible by 7.)
/*public static void main(String[] args){
    
    int count = 0;

    for(int i=1; i<=100; i++){
        if(i%7 ==0){
            count++;
        }
    }
    System.out.println(count);
}*/
//Count Numbers Divisible by 2 OR 7
 /*public static void main(String[] args){
    int count = 0;

    for(int i=1; i<=50; i++){
        if(i%2 ==0 || i%7 == 0){
            count++;
        }
    }
    System.out.println(count);
 }
    */

 



}




