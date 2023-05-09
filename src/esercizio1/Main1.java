package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {

		Set<Parole> mySet = new HashSet<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanti elementi vuoi inserire?");
		int indexSelected = scan.nextInt();
		System.out.println("Ok, adesso inserisci " + indexSelected + " parole");
		Parole str = new Parole(scan.next());
		mySet.add(str);

		scan.close();
	}
}
