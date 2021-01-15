package oop5GetSet;

public class GetSetTest {
	
	public static void main(String[] args) {
		
		Ogrenci ogr1 = new Ogrenci();
		Ogrenci ogr2 = new Ogrenci();
		
		ogr1.setIsým("Yusuf");
		ogr1.setsoyIsým("Sonakalan");
		ogr1.setdogumYili(1995);
		ogr1.setokulNumarasi("879");
		
		ogr2.setIsým("Emre");
		ogr2.setsoyIsým("Özcan");
		ogr2.setdogumYili(1995);
		ogr2.setokulNumarasi("999");
		
		System.out.println("Ýsim : " +ogr1.getIsým());
		System.out.println("SoyÝsim : " +ogr1.getsoyIsým());
		System.out.println("Doðum tarihi : " +ogr1.getdogumYili());
		System.out.println("Okul No : " +ogr1.getokulNumarasi());
		
		System.out.println("");
		
		System.out.println("Ýsim :" +ogr2.getIsým() + " , " + "Soyisim : " +ogr2.getsoyIsým() + " , " 
		+ "Doðum Yýlý : " +ogr2.getdogumYili() + " , " + "Okul Numarasý : " +ogr2.getokulNumarasi());
	}

}
