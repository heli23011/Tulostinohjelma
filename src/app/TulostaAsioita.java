package app;

public class TulostaAsioita {

	public static void main(String[] args) {
		// tehdään muutos GitHub-kokeilua varten
		
		String tekija = "Heli";
		double luku1 = 7;
		double luku2 = 5;
		double tulo = luku1 * luku2;
		double osamaara = luku1 / luku2;
		double summa = luku1 + luku2;
		double erotus = luku1 - luku2;
		
		System.out.println("Hei, olen tulostinohjelma.");
		
		//tulostetaan tekijä
		System.out.println("Ohjelman tekijä " + tekija);
		
		//tulostetaan luku1 ja luku2 -muuttujien arvot
		System.out.println("Luku1-muuttujan arvo on " + luku1);
		System.out.println("Luku2-muuttujan arvo on " + luku2);
		
		//tulostetaan tulo, osamäärä, summa ja erotus
		System.out.println("Lukujen 1 ja 2 tulo on " + tulo);
		System.out.printf("Tulo %f * %f = %f\n", luku1, luku2, tulo);
		System.out.printf("Osamäärä %.1f / %.1f = %.1f\n", luku1, luku2, osamaara);
		System.out.printf("Summa %.2f + %.2f = %.2f\n", luku1, luku2, summa);
		System.out.printf("Erotus %.3f - %.3f = %.1f", luku1, luku2, erotus);
	}

}
