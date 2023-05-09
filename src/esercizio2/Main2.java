package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		List<Integer> list = orderedList(10);
		System.out.println(list);
		System.out.println(reverseList(list));
		EvenOddList(list, false);

	}

	public static List<Integer> orderedList(int n) {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int randomNumber = r.nextInt(101);
			list.add(randomNumber);
		}
		return list;
	}

	public static List<Integer> reverseList(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);
		list.addAll(reversedList);
		return list;
	}

	public static void EvenOddList(List<Integer> list, boolean bool) {
		if (bool = true) {
			for (int i = 0; i < list.size(); i += 2) {
				System.out.println(list.get(i));
			}
		} else {
			for (int i = 1; i < list.size(); i += 2) {
				System.out.println(list.get(i));
			}
		}
	}
}
