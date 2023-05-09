package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Contatti {
	public static Map<String, String> contacts = new HashMap<>();

	public static void addContacts(String name, String number) {
		contacts.put(name, number);
		System.out.println("contatto " + name + " aggiunto in rubrica");
	}

	public static void removeContacts(String name) {
		if (contacts.containsKey(name)) {
			contacts.remove(name);
			System.out.println("Contatto " + name + " eliminato");
		} else {
			System.out.println("Contatto non esistente");
		}
	}

	public static void findContactFromNumber(String numero) {
		String contact = null;
		for (Map.Entry<String, String> entry : contacts.entrySet()) {
			if (entry.getValue().equals(numero)) {
				contact = entry.getKey();
				break;
			}
		}
		if (contact != null) {
			System.out.println("contatto trovato in rubrica: " + contact);
		} else {
			System.out.println("Contatto non trovato: " + numero);
		}
	}

	public static void findContactFromName(String name) {
		String contact = null;
		for (Map.Entry<String, String> entry : contacts.entrySet()) {
			if (entry.getKey().equals(name)) {
				contact = entry.getValue();
				break;
			}
		}
		if (contact != null) {
			System.out.println("Contatto trovato in rubrica: " + contact);
		} else {
			System.out.println("Contatto non trovato");
		}
	}

	public static void printContact() {
		System.out.println(contacts);
	}
}
