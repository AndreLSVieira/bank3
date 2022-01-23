package entities;

import java.util.Scanner;

public class AndreLSVieira {

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		
		Holder holder = new Holder(Holder.getNumber(), Holder.getHolder(), Holder.getInitialDeposit());
		holder = new Holder(Holder.getNumber(), Holder.getHolder());
		System.out.println("Entre com CC: ");
		Holder.setNumber(an.nextInt());
		System.out.println("Titular da CC: ");
		an.nextLine();
		Holder.setHolder(an.nextLine());
		System.out.printf("Initial deposit holder: %.2f\n", Holder.setInitialDeposit(100000.00));
		System.out.println(holder);
		System.out.println("Enter with deposit value: ");
		double depositValue = an.nextDouble();
		Holder.deposit(depositValue);
		System.out.println("Atualização da CC: ");
		System.out.println(holder);
		System.out.println("Enter the withdrawal amount: ");
		double withdrawalAmount = an.nextDouble();
		Holder.withdrawal(withdrawalAmount);
		System.out.println("CC Update: ");
		System.out.println(holder);
		an.close();

	}

}
