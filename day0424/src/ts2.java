public class ts2 {
}
class Account{
    long id;
    double balance;
    String password;
    static class SavingAccount extends Account{
        double interestRate;

        public void setInterestRate(double interestRate) {
            if (interestRate>=0.1 || interestRate<=0)
            {
                this.interestRate = 0.05;
                System.out.println("错误！利率必须大于0并小于10% ！");
                System.out.println("已重置为5% ！");
            } else {
                this.interestRate = interestRate;
            }
        }
    }
    static class CreditAccount extends Account{
        double creditLine;
    }

    public void setPassword(String password) {
        if (password.length() != 6) {
            System.out.println("新密码长度不是6位，修改失败！");
        } else {
            this.password = password;
            System.out.println("修改成功！");
        }
    }

    public String getPassword() {
        return null;
    }
}
