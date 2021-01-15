package oop2Constructor;

public class FutbolcuTest {

	public static void main(String[] args) {

		Futbolcu futbolcu1 = new Futbolcu("Yusuf", "Santrafor", "Liverpool", 25);

		System.out.println(futbolcu1.isim);
		System.out.println(futbolcu1.mevki);
		System.out.println(futbolcu1.takým);
		System.out.println(futbolcu1.yas);
		
		System.out.println("");

		Futbolcu futbolcu2 = new Futbolcu("Anelka", "Santrafor", "Chelsea", 30);

		System.out.println(futbolcu2.isim);
		System.out.println(futbolcu2.mevki);
		System.out.println(futbolcu2.takým);
		System.out.println(futbolcu2.yas);

	}

}
