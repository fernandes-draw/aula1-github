package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Employe;
import entity.Rent;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		sc.nextLine();
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j);

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		/*
		 * System.out.print("How many employees will be registered? "); int num =
		 * sc.nextInt();
		 * 
		 * List<Employe> list = new ArrayList<>();
		 * 
		 * for(int i = 1; i <= num; i++) { System.out.println("\nEmployee #" + i + ":");
		 * 
		 * System.out.print("Id: "); Integer id = sc.nextInt();
		 * 
		 * System.out.print("Name: "); sc.nextLine(); String name = sc.nextLine();
		 * 
		 * System.out.print("Salary: "); Double salary = sc.nextDouble();
		 * 
		 * list.add(new Employe(id, name, salary));
		 * 
		 * }
		 * 
		 * System.out.print("\nEnter the employee id that will have salary increase: ");
		 * int id = sc.nextInt();
		 * 
		 * Employe emp = list.stream().filter(x -> x.getId() ==
		 * id).findFirst().orElse(null); if (emp == null) {
		 * System.out.println("This id does not exist!"); }else {
		 * System.out.print("Enter the percentage: "); double percentage =
		 * sc.nextDouble(); emp.increaseSalary(percentage); }
		 * 
		 * System.out.println("\nList of employees:"); for(Employe obj : list) {
		 * System.out.print(obj); }
		 */

		/*
		 * int n = 10; Rent[] vect = new Rent[n];
		 * 
		 * System.out.print("How many rooms will be rented? "); int rooms =
		 * sc.nextInt();
		 * 
		 * for(int i = 1; i <= rooms; i++) { sc.nextLine();
		 * 
		 * System.out.println("\nRent #" + i);
		 * 
		 * System.out.print("Name: "); String name = sc.nextLine();
		 * 
		 * System.out.print("Email: "); String email = sc.nextLine();
		 * 
		 * System.out.print("Room: "); int room = sc.nextInt();
		 * 
		 * vect[room] = new Rent(name, email); }
		 * 
		 * System.out.println("\nBusy rooms:"); for(int i = 0; i < vect.length; i++) {
		 * if (vect[i] != null) { System.out.println(i + ": " + vect[i]);
		 * 
		 * } }
		 */

		/*
		 * Account account;
		 * 
		 * System.out.print("Enter account number: "); int number = sc.nextInt();
		 * 
		 * sc.nextLine(); System.out.print("Enter account holder: "); String holder =
		 * sc.nextLine();
		 * 
		 * System.out.print("Is there na initial deposit (y/n)? "); char response =
		 * sc.next().charAt(0);
		 * 
		 * if (response == 'y' || response == 'Y') {
		 * System.out.print("Enter initial deposit value: "); double initialDeposit =
		 * sc.nextDouble(); account = new Account(number, holder, initialDeposit); }else
		 * { account = new Account(number, holder); }
		 * 
		 * System.out.println("\nAccount data:"); System.out.println(account);
		 * 
		 * System.out.print("\nEnter a deposit value: ");
		 * account.deposit(sc.nextDouble());
		 * 
		 * System.out.println("Updated account data:"); System.out.println(account);
		 * 
		 * System.out.print("\nEnter a withdraw value: ");
		 * account.withdraw(sc.nextDouble());
		 * 
		 * System.out.println("Updated account data:"); System.out.println(account);
		 */

		/*
		 * System.out.print("What is the dollar price? "); CurrencyConverter.price =
		 * sc.nextDouble();
		 * 
		 * System.out.print("How many dollars will be bought? ");
		 * CurrencyConverter.bought = sc.nextDouble();
		 * 
		 * System.out.printf("Amount to be paid in reais = %.2f",
		 * CurrencyConverter.amount());
		 */

		/*
		 * System.out.print("Enter radius: "); double radius = sc.nextDouble();
		 * 
		 * double circunference = Calculator.circunference(radius); double volume =
		 * Calculator.volume(radius);
		 * 
		 * System.out.printf("Circunference: %.2f%n", circunference);
		 * System.out.printf("Volume: %.2f%n", volume);
		 * System.out.printf("PI value: %.2f%n", Calculator.PI);
		 */

		/*
		 * Student st = new Student(); System.out.print("Name: "); st.name =
		 * sc.nextLine(); System.out.print("grade 1: "); st.grade1 = sc.nextDouble();
		 * System.out.print("grade 2: "); st.grade2 = sc.nextDouble();
		 * System.out.print("grade 3: "); st.grade3 = sc.nextDouble();
		 * 
		 * System.out.println(st);
		 * 
		 * if (st.finalGrade() < 60.0) { System.out.println("FAILED");
		 * System.out.printf("MISSING %.2f POINTS", st.missingPoints()); } else {
		 * System.out.println("PASS"); }
		 */

		/*
		 * Employee emp = new Employee(); System.out.print("Name: "); emp.name =
		 * sc.nextLine(); System.out.print("Gross salary: "); emp.grossSalary =
		 * sc.nextDouble(); System.out.print("Tax: "); emp.tax = sc.nextDouble();
		 * 
		 * System.out.print("\nEmployee: " + emp);
		 * 
		 * System.out.print("\nWhich percentage to increase salary?"); double percentage
		 * = sc.nextDouble(); emp.increaseSalary(percentage);
		 * 
		 * System.out.println("\nUpdate data: " + emp);
		 */

		/*
		 * Rectangle rec = new Rectangle();
		 * System.out.println("Enter rectangle' width and height:"); rec.width =
		 * sc.nextDouble(); rec.height = sc.nextDouble();
		 * 
		 * System.out.println(rec);
		 */

		/*
		 * System.out.println("Enter product data:");
		 * 
		 * Product produto = new Product(); System.out.print("Name: "); produto.name =
		 * sc.nextLine(); System.out.print("Price: "); produto.price = sc.nextDouble();
		 * System.out.print("Quantity in stock: "); produto.quantity = sc.nextInt();
		 * 
		 * System.out.println("\nProduct data: " + produto);
		 * 
		 * System.out.print("\nEnter the number of products to be added in stock: ");
		 * int quantity = sc.nextInt(); produto.addProducts(quantity);
		 * 
		 * System.out.println("\nUpdate data: " + produto);
		 * 
		 * System.out.print("\nEnter the number of products to be removed from stock: "
		 * ); quantity = sc.nextInt(); produto.removeProducts(quantity);
		 * 
		 * System.out.println("\nUpdate data: " + produto);
		 */

		/*
		 * Triangle x, y; x = new Triangle(); y = new Triangle();
		 * 
		 * System.out.println("Enter the measures of triangle X:"); x.a =
		 * sc.nextDouble(); x.b = sc.nextDouble(); x.c = sc.nextDouble();
		 * 
		 * System.out.println("Enter the measures of triangle Y:"); y.a =
		 * sc.nextDouble(); y.b = sc.nextDouble(); y.c = sc.nextDouble();
		 * 
		 * System.out.printf("Triangle X area: %.4f%n", x.area());
		 * System.out.printf("Triangle Y area: %.4f%n", y.area());
		 * 
		 * if (x.area() > y.area()) { System.out.println("Larger area: X"); }else {
		 * System.out.println("Larger area: Y"); }
		 */

		sc.close();
	}

}
