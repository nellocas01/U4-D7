package esercizio3;

public class Main3 {

	public static void main(String[] args) {
		Contatti.addContacts("Franco", "95462644");
		Contatti.addContacts("Franco", "95462644");
		Contatti.addContacts("Franco", "95462644");
		Contatti.addContacts("Franco", "95462644");

		Contatti.findContactFromNumber("95462644");

		Contatti.findContactFromName("Franco");

		Contatti.printContact();

		Contatti.removeContacts("Franco");
	}

}
