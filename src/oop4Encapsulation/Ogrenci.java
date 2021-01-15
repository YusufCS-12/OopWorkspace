package oop4Encapsulation;

public class Ogrenci {

	private String isim;
	private String soy�sim;
	private int dogumYili;
	private String okulNumarasi;

	public Ogrenci() {

	}

	public Ogrenci(String i, String s, int d, String o) {

		isim = i;
		soy�sim = s;
		dogumYili = d;
		okulNumarasi = o;

	}

	public void isimVer(String i) {

		if (i.length() < 3) {
			System.out.println("Yetersiz isim giri�i. !");
		} else
			i = isim;
	}

	public void soy�simVer(String s) {

		if (s.length() < 3) {
			System.out.println("Yetersiz soyisim giri�i. !");
		} else
			s = soy�sim;
	}

	public void DogumYiliVer(int d) {

		if (d < 1900 || d>2021) {
			System.out.println("Uygunsuz Do�um Tarihi Giri�i !");
		} else
			d = dogumYili;
	}

	public void OkulNumarasiVer(String o) {

		if (o.length() != 4 ) {
			System.out.println("Yetersiz Okul Numars�. 4 Hane Olmal�. !");
		} else
			o = okulNumarasi;
	}
}
