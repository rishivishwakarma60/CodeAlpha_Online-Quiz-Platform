package code_alpha;

import java.util.Scanner;



class Bank{
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;
	
	public void setbankAddress(String bankAddress) {
		this.bankAddress=bankAddress;
	}
	public String getbankAddress() {
		return bankAddress;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCustomerName() {
		return bankCustomerName;
	}
	public void setBankCustomerName(String bankCustomerName) {
		this.bankCustomerName = bankCustomerName;
	}
	public String getBankIFSCCode() {
		return bankIFSCCode;
	}
	public void setBankIFSCCode(String bankIFSCCode) {
		this.bankIFSCCode = bankIFSCCode;
	}
	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public void setDetails(String bankName,String bankCustomerName, String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance ) {
		
	
	}
	public void withdraw(double amount,int currentBalance) {
		getCurrentBalance();
		System.out.println(currentBalance);
		
		if ((currentBalance) <=1000) {
			System.out.println("Insufficient balance to withdraw");
		}
		else {
			currentBalance=currentBalance-(int)amount;
			if(currentBalance<=1000) {
				System.out.println("Maintain MinimumBalance ");
			}
			else if(currentBalance>1000) {
				System.out.println("=========================================");
				System.out.println("Transaction Successfull");
				System.out.println();
				System.out.println("Available balance:"+currentBalance);
			}
		}
	}
	
	public void deposit(double amount,int currentBalance) {
		currentBalance=(int)amount+currentBalance;
		System.out.println("Deposited Succesfully");
		System.out.println();
		System.out.println("Available balance:"+currentBalance);
		System.out.println("-------------------------------------------------");
		
		
		
		
	}
	public void currentBalance(int currentBalance) {
		System.out.println("Available Balance:"+currentBalance);
	}
	public String displayDetails() {
        return toString();
    }

    
    public String toString() {
    	return "BankDetails[Bank Name: " + bankName + ", Customer Name: " + bankCustomerName + ", Address: " + bankAddress + ", Account Number: " + customerAccountNumber + ", Balance: " + currentBalance + "]";
    }
    
 
	
}
public class SImpleBankingApp{
	public static void main(String[] args) {
		Bank n=new Bank();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of bank");
		String bankName= sc.nextLine();
		n.setBankName(bankName);
		
		System.out.println("Enter the customeername");
		String bankCustomerName=sc.nextLine();
		
		n.setBankCustomerName(bankCustomerName);
		System.out.println("Enter the address of Bank");
		String bankAddress=sc.nextLine();
		
		n.setbankAddress(bankAddress);
		System.out.println("Enter The IFSC code of Bank");
		String bankIFSCCode=sc.nextLine();
		
		n.setBankIFSCCode(bankIFSCCode);
		
		System.out.println("Enter Account number");
		int customerAccountNumber=sc.nextInt();
		n.setCustomerAccountNumber(customerAccountNumber);
		System.out.println("Enter Currentbalance");
		 int currentBalance= sc.nextInt();
		 n.setCurrentBalance(currentBalance);
		 n.setDetails(n.getBankName(),n.getBankCustomerName(), n.getbankAddress(), n.getBankIFSCCode(), n.getCustomerAccountNumber(),n.getCurrentBalance());
		 System.out.println("---------------------------------------------");
		 
		
		System.out.println("Enter 1 for balance enquiry");
		System.out.println("Enter 2 for withdraw amount");
		System.out.println("Enter 3 for deposit");
		System.out.println("Enter 4 for display customer details");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
		n.currentBalance(currentBalance);
		}
		break;
		case 2:{
			System.out.println("Enter the amount you want to withdraw");
			int amount=sc.nextInt();
			n.withdraw(amount,currentBalance);
		}
		break;
		case 3:{
			System.out.println("Enter the amount to deposit");
			int amount = sc.nextInt();
			n.deposit(amount,currentBalance);
		} break;
		case 4:{
			System.out.println(n.displayDetails());
		}
		}
		
		
		
	}

}

