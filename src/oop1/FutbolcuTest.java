package oop1;

public class FutbolcuTest {

	public static void main(String[] args) {

		Futbolcu futbolcu1 = new Futbolcu();

		futbolcu1.isim = "Alex De Souza";
		futbolcu1.mevki = "Ofansif Orta Saha";
		futbolcu1.tak�m = "Fenerbah�e";
		futbolcu1.yas = 32;

		Futbolcu futbolcu2 = new Futbolcu();

		futbolcu2.isim = "Pierre Van Hoijdonk";
		futbolcu2.mevki = "Forvet";
		futbolcu2.tak�m = "Fenerbah�e";
		futbolcu2.yas = 35;

		Futbolcu futbolcu3 = new Futbolcu();

		futbolcu3.isim = "Tuncay �anl�";
		futbolcu3.mevki = "Kanat";
		futbolcu3.tak�m = "Fenerbah�e";
		futbolcu3.yas = 23;

		System.out.println("Futbolcu1");
		System.out.println("�sim => " + futbolcu1.isim);
		System.out.println("Mevki => " + futbolcu1.mevki);
		System.out.println("Tak�m => " + futbolcu1.tak�m);
		System.out.println("Ya� => " + futbolcu1.yas);
		
		System.out.println("");

		System.out.println("Futbolcu2");
		System.out.println("�sim => " + futbolcu2.isim);
		System.out.println("Mevki => " + futbolcu2.mevki);
		System.out.println("Tak�m => " + futbolcu2.tak�m);
		System.out.println("Ya� => " + futbolcu2.yas);
		
		System.out.println("");


		System.out.println("Futbolcu3");
		System.out.println("�sim => " + futbolcu3.isim);
		System.out.println("Mevki => " + futbolcu3.mevki);
		System.out.println("Tak�m => " + futbolcu3.tak�m);
		System.out.println("Ya� => " + futbolcu3.yas);
		
		System.out.println("");

	}

}
