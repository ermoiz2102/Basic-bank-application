package Banking;

public interface RBI {

    public String checkBalance(String password);
    public String withDraw(String password,int money);
    public String deposit(String password,int money);
    public String changepass(String oldpass,String newpass);
    public double ROI(int years);
}
