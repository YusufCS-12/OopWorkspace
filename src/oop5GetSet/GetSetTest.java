package oop5GetSet;

public class GetSetTest {
	
	public static void main(String[] args) {
		
		Ogrenci ogr1 = new Ogrenci();
		Ogrenci ogr2 = new Ogrenci();
		
		ogr1.setIs�m("Yusuf");
		ogr1.setsoyIs�m("Sonakalan");
		ogr1.setdogumYili(1995);
		ogr1.setokulNumarasi("879");
		
		ogr2.setIs�m("Emre");
		ogr2.setsoyIs�m("�zcan");
		ogr2.setdogumYili(1995);
		ogr2.setokulNumarasi("999");
		
		System.out.println("�sim : " +ogr1.getIs�m());
		System.out.println("Soy�sim : " +ogr1.getsoyIs�m());
		System.out.println("Do�um tarihi : " +ogr1.getdogumYili());
		System.out.println("Okul No : " +ogr1.getokulNumarasi());
		
		System.out.println("");
		
		System.out.println("�sim :" +ogr2.getIs�m() + " , " + "Soyisim : " +ogr2.getsoyIs�m() + " , " 
		+ "Do�um Y�l� : " +ogr2.getdogumYili() + " , " + "Okul Numaras� : " +ogr2.getokulNumarasi());
	}

}
