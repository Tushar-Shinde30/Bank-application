public class Main {


    public static void main(String[] args) {

        HDFCAccount TusharAcc = new HDFCAccount("Tushar","Tushar@123",8000);

        System.out.println(TusharAcc);     //Printed the Attributes via the toString.

        //fetchBalance
        System.out.println(TusharAcc.fetchBalance("Tushar@123"));
        System.out.println(TusharAcc.fetchBalance("Tuhar123"));

        //addMoney
        System.out.println(TusharAcc.addMoney(3000));

        //withdrawMoney
        System.out.println(TusharAcc.withdrawMoney(2000,"Tushar@123"));
        System.out.println(TusharAcc.withdrawMoney(1000,"Tushar123"));
        System.out.println(TusharAcc.withdrawMoney(150000,"Tushar@123"));

        //changePassword
        System.out.println(TusharAcc.changePassword("Tushar@123","TSShinde@3340"));
        System.out.println(TusharAcc.changePassword("Shinde@123","TUSHAR@123"));

        //calculateInterest
        System.out.println("Interest for 5 year's on current balance will be :"+ TusharAcc.calculateInterest(5));

//        System.out.println(TusharAcc.fetchBalance("Tushar@123"));
//        System.out.println(TusharAcc.fetchBalance("Tushar123"));
//
//        System.out.println(TusharAcc.addMoney(5000));
//
//        System.out.println(TusharAcc.changePassword("Tushar@123","Tushar123"));
//
//        System.out.println(TusharAcc.withdrawMoney(3000,"Tushar123"));


    }
}