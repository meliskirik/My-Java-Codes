import java.util.Scanner;

public class Test {
 
	public static void main(String[] args) {
		// Calisan sinifini olusturalim

		System.out.println("***********Uygulamaya Hosgeldinz********");
		Scanner scanner = new Scanner(System.in);

		System.out.print("No degerini giriniz : ");
		int no = scanner.nextInt();
		scanner.nextLine();

		System.out.print("İsim degerini giriniz : ");
		String isim = scanner.nextLine();

		System.out.print("Soyisim degerini giriniz : ");
		String soyisim = scanner.nextLine();

		System.out.print("Tecrube degerini giriniz : ");
		int tecrube = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Maas degerini giriniz : ");
		double maas = scanner.nextDouble();
		scanner.nextLine();

		Calisan calisan = new Calisan(no, isim, soyisim, tecrube, maas);

		String islemler = "1-Calısan bilgilerini goster\n" + "2-Zam yap\n" + "3-Format at";

		System.out.println("----------------------------");
		System.out.println(islemler);
		System.out.print("Secim Yapiniz : ");
		int secim = scanner.nextInt();

		scanner.nextLine();

		switch (secim) {
		case 1:
			calisan.calisanBilgileriniGoster();
			break;
		case 2:
			System.out.print("Zam degerini giriniz : ");
			int zamDegeri = scanner.nextInt();
			calisan.zamYap(zamDegeri);
			break;
		case 3:
			System.out.print("Format atacak kisinin ismi : ");
			String kisi = scanner.nextLine();

			System.out.print("İsletim sistemini yaziniz : ");
			String isletimSistemi = scanner.nextLine();
			calisan.formatAt(isletimSistemi, kisi);
			break;
		default:
			System.out.println("Lutfen belirtilen secimlerden birini seciniz.");
			break;
		}

	}

}
