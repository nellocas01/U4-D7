package esercizio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.println("Quante parole vuoi inserire?");
				number = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Numero non valido, inseriscine un altro");
			}
		}
		Set<String> mySet = new HashSet<>();
		Set<String> duplicateWords = new HashSet<>();

		if (number > 0) {
			for (int i = 0; i < number; i++) {
				System.out.println("inserisci la parola numero " + (i + 1));
				String word = scanner.next();
				if (mySet.contains(word)) {
					duplicateWords.add(word);
				} else {
					mySet.add(word);
				}
			}
			System.out.println("parole duplicate: " + duplicateWords);
			System.out.println("numero di parole: " + mySet.size());
			System.out.println("parole distinte: " + mySet);
		}

		scanner.close();
	}
}
