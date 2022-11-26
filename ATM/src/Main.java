import java.util.Scanner;
class ATM{
    String Loc;
    long pincode;
    long ac;
    long acPin;
 Scanner sc=new Scanner(System.in);
    void Atm()
    {
        System.out.println("Thank You for using the Atm services....");
    }

}
class customer extends ATM{
    void welcome()
    {
        int ch;
        System.out.println("WELCOME TO THE ATM.....");
        System.out.println("Enter your choice from the above options.....");
        System.out.println("1.Banking\n2.Mini Statement\n3.Check Balance\n4.Change Pin\n5.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:

        }
    } void deposit()
    {
        System.out.println("Enter ");

    }
    void withdrawl()
    {
        System.out.println("The withdrawl ammount is.......");

    }

        }
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        customer c = new customer();
        c.welcome();

    }
}