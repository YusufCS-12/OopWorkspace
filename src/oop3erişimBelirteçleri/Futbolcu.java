package oop3eri�imBelirte�leri;

public class Futbolcu {

	String isim;
	String tak�m;
	String mevki;
	int yas;
	
	// Bu Constructor �stteki ile ayn� mant�k oldu�u i�in de�erler nesnenin i�inde verilmez. Tek tek de�er gireriz.
	public Futbolcu() {}

	/* Constructor yani yap�c� metot. Metot i�inde yap�c� de�erler verdik ve �st taraftaki de�erleri buraya e�itleyerek 
	kullanmak isted�imiz nesneye direk yazarak kullanabilece�iz */

	public Futbolcu(String i, String t, String m, int y) {

		isim = i;
		tak�m = t;
		mevki = m;
		yas = y;

	}

}
