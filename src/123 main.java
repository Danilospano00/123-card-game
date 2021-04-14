import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class boh1 {
	public static void main(String[] args) {

		// Array
		String[] carte = { "Asso di bastoni", "Due di bastoni", "Tre di bastoni", "Quattro di bastoni",
				"Cinque di bastoni", "Sei di bastoni", "Sette di bastoni", "Fante di bastoni", "Cavallo di bastoni",
				"Re di bastoni", "Asso di denara", "Due di denara", "Tre di denara", "Quattro di denara",
				"Cinque di denara", "Sei di denara", "Sette di denara", "Fante di denara", "Cavallo di denara",
				"Re di denara", "Asso di spade", "Due di spade", "Tre di spade", "Quattro di spade", "Cinque di spade",
				"Sei di spade", "Sette di spade", "Fante di spade", "Cavallo di spade", "Re di spade", "Asso di coppe",
				"Due di coppe", "Tre di coppe", "Quattro di coppe", "Cinque di coppe", "Sei di coppe", "Sette di coppe",
				"Fante di coppe", "Cavallo di coppe", "Re di coppe" };

		// Shuffle array
		List StringList = Arrays.asList(carte);
		Collections.shuffle(StringList);
		StringList.toArray(carte);

		Scanner input = new Scanner(System.in);
		System.out.println("Uno due tre! Premi invio per iniziare a giocare");
		String sel = input.nextLine();
		System.out.println("Gira una carta premendo invio!");

		int x = 1;
		String n;
		for (int i = 0; i < carte.length; i++) {
			n = carte[i];
			Scanner gira = new Scanner(System.in);
			String sel2 = gira.nextLine();

			// Stampa delle carte
			System.out.print(x + " - ");
			System.out.println(n);

			// Condizioni sconfitta
			if ((x == 1) && (n.contains("Asso"))) {
				System.out.println("Hai perso");
				System.exit(0);
			} else if ((x == 2) && (n.contains("Due"))) {
				System.out.println("Hai perso");
				System.exit(0);
			} else if ((x == 3) && (n.contains("Tre"))) {
				System.out.println("Hai perso");
				System.exit(0);
			}

			//
			x++;
			if (x == 4)
				x = 1;

			// Condizione vittoria
			if (i == 39)
				System.out.println("Hai vinto!");

		}
	}
}