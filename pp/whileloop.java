package pp;

public class whileloop {
    public static void main(String[] args){

        int i = 1;
        int j = 1;

         do{
             System.out.println(i);
             i++;

             do{
                System.out.println(j);
                j++;
             }while(j<=5); 

        }while(i<=10);
}
}
