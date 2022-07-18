package c2tc;

import c2tc.application.MMBankFactory;
import c2tc.application.MMCurrentAcc;
import c2tc.application.MMSavingAcc;
import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
    SavingAcc sa=new MMSavingAcc(123,"poornima",1000);
    sa.deposite(2000);
    CurrentAcc ca=new MMCurrentAcc(123,"yogita",0);
    ca.deposite(2000);

    
    
	}

}
