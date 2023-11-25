package Banking;

public class kotakbank implements RBI {

    private int balance;
    private String password;

    private String Accno;

    public static final double interest=9.2;

    public kotakbank(int balance, String password, String Accno) {
        this.balance = balance;
        this.password = password;
        this.Accno = Accno;
    }

    @Override
    public String checkBalance(String pass) {
        if(pass.equals(password)){
            return "Your current account balance is:"+balance;
        }
        else
            return "Please enter correct password!!";
    }

    @Override
    public String withDraw(String pass, int money) {
        if(pass.equals(password)){
            if(balance-money<500)
                return "please maintain minimal account balance!!";
                else{
                    balance-=money;
                    return "Withdraw successful!! remaining account balance:"+balance;
            }
        }
        else
            return "Please enter correct password!!";

    }

    @Override
    public String deposit(String pass, int money) {
        if (pass.equals(password)){
            balance+=money;
            return "Deposit Successful!! current acc balance is:"+balance;
        }
        else
            return "Please enter correct password!!";
    }

    @Override
    public String changepass(String oldpass, String newpass) {
        if(oldpass.equals(password)){
            if(newpass.equals(oldpass))
                return "old password and new password cannot be same!!";
                else{
                    password=newpass;
                    return "password changed successfully";
            }
        }
        else
            return "Please enter correct password!!";
    }

    @Override
    public double ROI(int years) {
        return balance*interest*years;
    }
}
