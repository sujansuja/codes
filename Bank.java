import java.util.Scanner;

class Bank{
	int balance;
	Scanner sc;
	Bank(){
		balance = 0;
		int[] trans = new int[100]; 
		sc = new Scanner(System.in);
	}

	void withdraw(){
		System.out.println("***** WITHDRAW *****");
		System.out.print("Enter the amount(in multiples of 100 and max 40000): ");
		int amount = sc.nextInt();
		if(amount % 100 != 0 || amount > 40000){
			System.out.println("Amount is invalid. Enter the amount in multiples of 100 and below 40000");
		} else if(amount > balance){
			System.out.println("Entered amount is greater than Balance");
		}
	}

	void deposit(){
		int notesCount = 0;
		int[] notes = {500, 200, 100, 50, 20, 10};
		System.out.println("***** DEPOSIT *****");
		System.out.println("Enter the amount(in multiples of 100): ");
		System.out.println("Enter the denominations: ");
		System.out.print("500 * ");
		int fh = sc.nextInt();
		System.out.print("200 * ");
		int th = sc.nextInt();
		System.out.print("100 * ");
		int oh = sc.nextInt();
		System.out.print("50 * ");
		int fifty = sc.nextInt();
		System.out.print("20 * ");
		int twenty = sc.nextInt();
		System.out.print("10 * ");
		int ten = sc.nextInt();
		notesCount = fh + th + oh + fifty + ten;
		if(notesCount > 200){
			System.out.println("Max 200 notes can only be deposit");
		}
	}
		
	public static void main(String args[]){
		new Bank().withdraw();
		new Bank().deposit();
	}
}
