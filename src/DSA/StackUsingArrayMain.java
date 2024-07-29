package DSA;

import java.util.Scanner;

public class StackUsingArrayMain {
    public static void main(String[]args)
    {
        StackUsingArray s=new StackUsingArray();

        Scanner sc=new Scanner(System.in);




        int ch=0;

      while(ch!=4) {
          System.out.println("1.push 2.Pop 3.Display 4.Exit");
          System.out.println("Enter choice :");
          ch = sc.nextInt();

          switch (ch) {
              case 1:
                  s.push();
                  break;

              case 2:
                  s.pop();
                  break;

              case 3:
                  s.display();
                  break;

              case 4:
                  System.out.println("Exiting....");
                  System.exit(0);
                  break;

              default: {
                  System.out.println("Enter valid choice");
              }
          };

      }
      }



    }

