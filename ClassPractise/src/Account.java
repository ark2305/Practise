public class Account {

    private String accountNo;
    private String accHolderName;



    //default constructor
   /* Account(String accountNo){
//        this();
        System.out.println("constructor 1");
        this.accountNo= accountNo;
    }

    Account(String accountNo, String accHolderName){
        this(accountNo);
        System.out.println("constructor 2");
        this.accHolderName= accHolderName;
    }*/

    /*Account(){
        System.out.println("default");
    }*/

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", accHolderName='" + accHolderName + '\'' +
                '}';
    }

    public static void main(String[] args){

//        Account account= new Account("1234", "Vijay");
        Account account= new Account();
        System.out.println(account);

    }
}

