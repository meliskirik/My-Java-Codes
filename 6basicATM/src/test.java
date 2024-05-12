import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// Melis Kirik IBAN : TR123 456 789
		// Melis'in kullanici adi : melis1
		// Melis'in sifresi : 123
		
		// Harun Arslan IBAN : TR987 654 321
		// Harun'un kullanici adi : harun2
		// Harun'un sifresi : 456
		
		String islemSecenekleri = "Bakiye Goruntuleme icin --> 1 " + "Para Cekme icin --> 2 "
		+ "Farklı Hesaba Para Yatirma icin --> 3 " + "Cıkıs Yapmak icin --> c ";
				
		Scanner scanner = new Scanner(System.in);
		
		double melisBakiye = 2500;
		String melisIBAN = "TR123 456 789";
		String melisKullanici = "melis1";
		String melisSifre = "123";
		
		double harunBakiye = 4500;
		String harunIBAN = "TR987 654 321";
		String harunKullanici = "harun2";
		String harunSifre = "456";
		
		
		System.out.println("ATM'ye Hosgeldiniz ");
		System.out.println("Lutfen bilgilerinizi giriniz ");
		
		System.out.print("Kullanici adi : ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.print("Sifre : ");
		String sifre = scanner.nextLine();
		
		if (kullaniciAdi.equals(melisKullanici) && sifre.equals(melisSifre)) {
			System.out.println("Melis Kirik hesabina giris yapildi ");
			System.out.println(islemSecenekleri);
			System.out.print("Lütfen bir islem seciniz : ");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz : " + melisBakiye);
				break;
			case "c":
				System.out.println("Hesaptan cıkıs yapiliyor ");
				break;
			case "2":
				System.out.print("Cekmek istediginiz tutari giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				if (cekilecekTutar <= melisBakiye) {
					melisBakiye -= cekilecekTutar;
					System.out.println("Kalan tutar: " + melisBakiye);					
				} else {
					System.out.println("Bakiyenizden fazla tutar cekemezsiniz. ");
				}
				break;
			case "3":
				System.out.print("Yatıracagınız tutari giriniz: ");
				int yatirilacakTutar = scanner.nextInt();
				if (yatirilacakTutar <= melisBakiye) {
					
					System.out.print("IBAN giriniz: ");
					scanner.nextLine();
					String yatirilacakIBAN = scanner.nextLine();
					if (yatirilacakIBAN.equals(harunIBAN)) {
						
						System.out.println("Para Harun Arslan adli hesaba yatiriliyor..");
						harunBakiye += yatirilacakTutar;
						melisBakiye -= yatirilacakTutar;
						
						System.out.println("Bakiyeniz: " + melisBakiye);
						System.out.println("Harun Bakiye: " + harunBakiye);
 				}
					break;
					
				} else {
					System.out.println("Bakiyenizden fazla para gonderemezsiniz "); 
				}
				}
			} else if (kullaniciAdi.equals(harunKullanici) && sifre.equals(harunSifre)) {
				
				System.out.println("Harun Arslan hesabina giris yapiliyor... ");
				System.out.println(islemSecenekleri);
				
				System.out.print("Lütfen bir islem seciniz : ");
				String secim = scanner.nextLine();
				
				switch (secim) {
				case "1":
					System.out.println("Bakiyeniz : " + harunBakiye);
					break;
				case "c":
					System.out.println("Hesaptan cıkıs yapiliyor ");
					break;
				case "2":
					System.out.print("Cekmek istediginiz tutari giriniz: ");
					int cekilecekTutar = scanner.nextInt();
					if (cekilecekTutar <= harunBakiye) {
						harunBakiye -= cekilecekTutar;
						System.out.println("Kalan tutar: " + harunBakiye);					
					} else {
						System.out.println("Bakiyenizden fazla tutar cekemezsiniz. ");
					}
					break;
				case "3":
					System.out.print("Yatıracagınız tutari giriniz: ");
					int yatirilacakTutar = scanner.nextInt();
					if (yatirilacakTutar <= harunBakiye) {
						
						System.out.print("IBAN giriniz: ");
						scanner.nextLine();
						String yatirilacakIBAN = scanner.nextLine();
						if (yatirilacakIBAN.equals(melisIBAN)) {
							
							System.out.println("Para Melis Kirik adli hesaba yatiriliyor..");
							melisBakiye += yatirilacakTutar;
							harunBakiye -= yatirilacakTutar;
							
							System.out.println("Bakiyeniz: " + harunBakiye);
							System.out.println("Melis Bakiye: " + melisBakiye);
	 				}
						break;
						
					} else {
						System.out.println("Bakiyenizden fazla para gonderemezsiniz "); 
					}
					}
				
			
			} else {
				System.out.println("Kullanici adiniz veya sifreniz yanlis");
			}
	}			
}
