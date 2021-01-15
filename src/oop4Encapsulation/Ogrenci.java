package oop4Encapsulation;

public class Ogrenci {

	private String isim;
	private String soyÝsim;
	private int dogumYili;
	private String okulNumarasi;

	public Ogrenci() {

	}

	public Ogrenci(String i, String s, int d, String o) {

		isim = i;
		soyÝsim = s;
		dogumYili = d;
		okulNumarasi = o;

	}

	public void isimVer(String i) {

		if (i.length() < 3) {
			System.out.println("Yetersiz isim giriþi. !");
		} else
			i = isim;
	}

	public void soyÝsimVer(String s) {

		if (s.length() < 3) {
			System.out.println("Yetersiz soyisim giriþi. !");
		} else
			s = soyÝsim;
	}

	public void DogumYiliVer(int d) {

		if (d < 1900 || d>2021) {
			System.out.println("Uygunsuz Doðum Tarihi Giriþi !");
		} else
			d = dogumYili;
	}

	public void OkulNumarasiVer(String o) {

		if (o.length() != 4 ) {
			System.out.println("Yetersiz Okul Numarsý. 4 Hane Olmalý. !");
		} else
			o = okulNumarasi;
	}
}
