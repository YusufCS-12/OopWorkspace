package oop1;

public class FutbolcuTest {

	public static void main(String[] args) {

		Futbolcu futbolcu1 = new Futbolcu();

		futbolcu1.isim = "Alex De Souza";
		futbolcu1.mevki = "Ofansif Orta Saha";
		futbolcu1.takým = "Fenerbahçe";
		futbolcu1.yas = 32;

		Futbolcu futbolcu2 = new Futbolcu();

		futbolcu2.isim = "Pierre Van Hoijdonk";
		futbolcu2.mevki = "Forvet";
		futbolcu2.takým = "Fenerbahçe";
		futbolcu2.yas = 35;

		Futbolcu futbolcu3 = new Futbolcu();

		futbolcu3.isim = "Tuncay Þanlý";
		futbolcu3.mevki = "Kanat";
		futbolcu3.takým = "Fenerbahçe";
		futbolcu3.yas = 23;

		System.out.println("Futbolcu1");
		System.out.println("Ýsim => " + futbolcu1.isim);
		System.out.println("Mevki => " + futbolcu1.mevki);
		System.out.println("Takým => " + futbolcu1.takým);
		System.out.println("Yaþ => " + futbolcu1.yas);
		
		System.out.println("");

		System.out.println("Futbolcu2");
		System.out.println("Ýsim => " + futbolcu2.isim);
		System.out.println("Mevki => " + futbolcu2.mevki);
		System.out.println("Takým => " + futbolcu2.takým);
		System.out.println("Yaþ => " + futbolcu2.yas);
		
		System.out.println("");


		System.out.println("Futbolcu3");
		System.out.println("Ýsim => " + futbolcu3.isim);
		System.out.println("Mevki => " + futbolcu3.mevki);
		System.out.println("Takým => " + futbolcu3.takým);
		System.out.println("Yaþ => " + futbolcu3.yas);
		
		System.out.println("");

	}

}
