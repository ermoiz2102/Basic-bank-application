package Banking;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Please Enter desired Account no:");
        Scanner sc= new Scanner(System.in);
        String accno=sc.next();
        System.out.println("Please Enter desired Password:");
        String pass= sc.next();
        System.out.println("Please Enter the deposit amount:");
        int money= sc.nextInt();
        System.out.println("Please Enter  the desired Bank:");
        System.out.println("Please Enter kotakbank or SBI");
        String name=sc.next();
        RBI desiredbank;
        if(name.equals("kotakbank")){
            desiredbank = new kotakbank(money,pass,accno);
        }
        else {
            desiredbank=new SBI(money,pass,accno);
        }

        System.out.println(desiredbank.checkBalance("Moiz"));
        System.out.println (desiredbank.deposit("Moiz",500));
        System.out.println (desiredbank.withDraw("Moiz",300));
        System.out.println (desiredbank.ROI(5));
        System.out.println (desiredbank.changepass("Moiz","Khan"));
        System.out.println (desiredbank.checkBalance("Moiz"));



    }
}