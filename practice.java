import java.util.*;

public class practice {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your account starting balance?");
		double num = sc.nextDouble();
		
		BankAccount  account = new BankAccount(num);
		
		System.out.println("How much were you paid this month?");
		num =sc.nextDouble();
		account.deposit(num);
		
		System.out.printf("Your pay has been deposited.\n"+"Your current balance is $%,.2f",account.getBalance());
		System.out.println("\n");
		System.out.println("How much would you like to withdraw?");
		num = sc.nextDouble();
		account.withdraw(num);
		
		System.out.printf("Now your balance is $%,.2f",account.getBalance());
		
}
	
}

