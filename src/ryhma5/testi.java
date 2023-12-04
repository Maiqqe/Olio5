package ryhma5;

public class testi {

	public static void main(String[] args) {
		// Muodostetaan Kannykka-luokasta olio
		
		Kannykka puhelin1 = new Kannykka ();
		puhelin1.merkki = "iPhone";
		puhelin1.os = "iOS";
		System.out.println("Olion tietoja");
		System.out.println("Merkki: " + puhelin1.merkki);
		puhelin1.Kaynnisty();
		puhelin1.soitaPuhelu("+3585033632222");
		
		
		Kannykka puhelin2 = new Kannykka();
		puhelin2.os = "Android";
		System.out.println("Olion tietoja");
		System.out.println("Käyttöjärjestelmä: " + puhelin2.os);
		
		Kannykka puhelin3 = new Kannykka ("Nokia", "Android", false);
		puhelin3.tulostaTietoja();
	}

}// Main-luokan lopetus

// Kännykkä-luokka (olisi oikeasti omassa tiedostossa)
class Kannykka {
	//ominaisuudet
	String merkki;
	String os;
	boolean paalla;	
	
	// Muodostimet / Constructor
	
		// oletusmuodostin
		public Kannykka()
		{
			merkki="";
			os="";
			paalla=false;
		}
		
		// parametrinen muodostin
		public Kannykka(String m, String o, boolean p)
		{
			merkki=m;
			os=o;
			paalla=p;
		}
		
	//toiminnallisuudet
	public void Kaynnisty() {
		System.out.println("Puhelin on käynnistetty");
		paalla = true;
	}
	
	public void soitaPuhelu(String puhelinNumero) {
		if (paalla==true)
		System.out.println("Soittaa numeroon " + puhelinNumero);
	}
	//tulostaa tietoja puhelimesta.
    public void tulostaTietoja()
	{
		System.out.println("*** Olion tietoja ***");
		System.out.println("Merkki: " + merkki);
		System.out.println("Käyttöjärjestelmä: " + os);
	}




}