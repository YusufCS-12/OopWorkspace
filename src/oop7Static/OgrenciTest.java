package oop7Static;

public class OgrenciTest {
	
	public static void main(String[] args) {
		
		Ogrenci.setOkul("Erciyes �niversitesi");
		Ogrenci.getOkul();
		
		Ogrenci ogr1 = new Ogrenci();
		Ogrenci ogr2 = new Ogrenci();
		
		ogr1.setIsim("Joseph");
		ogr1.getIsim();
		
		ogr2.setIsim("Nicholas");
		ogr2.getIsim();
		
		System.out.println("Ad� : " +ogr1.getIsim() + " " + Ogrenci.getOkul() );
		System.out.println("Ad� : " +ogr2.getIsim() + " " + Ogrenci.getOkul() );

	}

}
