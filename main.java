import java.util.Scanner;
class Main
{
          public static void main(String[] args)
          {
                 Scanner obj=new Scanner(System.in);
               
                 System.out.print("Enter name: ");
                 String name=obj.nextLine();
                 System.out.println("Name: "+name);     
                 System.out.print("Enter age: "); 
                 Integer age=obj.nextInt();
                 System.out.println("Age: "+age);
            
          }
}