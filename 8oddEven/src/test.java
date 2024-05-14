import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("Sayi Tek mi Cift mi Bulma Programı ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dizi kac elemanli olsun: ");
		int diziLength = scanner.nextInt();
		scanner.nextLine();
		
		int[] sayilar = new int[diziLength];
		
		for (int i = 0; i < sayilar.length; i++)
		{
			System.out.print("Dizinin " + i + ". indexini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for (int deger : sayilar)
		{
			tekMiCiftMi(deger);
		}
		scanner.close();
	}

	public static void tekMiCiftMi(int sayi)
	{
		if (sayi % 2 == 0)
		{
			System.out.println("Sayi " + sayi + " CİFTTİR");
		} else {
			System.out.println("Sayi " + sayi + " TEKTİR");
		}
	}
}
