package oop3eriþimBelirteçleri;

public class Futbolcu {

	String isim;
	String takým;
	String mevki;
	int yas;
	
	// Bu Constructor üstteki ile ayný mantýk olduðu için deðerler nesnenin içinde verilmez. Tek tek deðer gireriz.
	public Futbolcu() {}

	/* Constructor yani yapýcý metot. Metot içinde yapýcý deðerler verdik ve Üst taraftaki deðerleri buraya eþitleyerek 
	kullanmak istedðimiz nesneye direk yazarak kullanabileceðiz */

	public Futbolcu(String i, String t, String m, int y) {

		isim = i;
		takým = t;
		mevki = m;
		yas = y;

	}

}
