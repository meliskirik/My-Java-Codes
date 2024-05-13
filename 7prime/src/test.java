import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.tools.Diagnostic;

public class test {

	public static void main(String[] args) {
		System.out.println("Asal sayi uygulamasina hosgeldiniz. ");
		
		int asalToplam = 0;
		int asalOlmayanToplam = 0;
		
		String asalSayilar = " ";
		String asalOlmayanSayilar = " ";
		
		boolean asalMi = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin eleman uzunlugunu giriniz: ");
		int diziUzunluk = scanner.nextInt();
		scanner.nextLine();
		
		int[] sayilar = new int[diziUzunluk];
		
		for (int i = 0 ; i < sayilar.length ; i++ )
		{
			System.out.print("Dizinin  " + i + ". indeksini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for (int sayi : sayilar)
		{
			for ( int j = 2; j< sayi; j++)
			{
				if (sayi % j == 0)
				{
					asalOlmayanToplam += 1;
					asalOlmayanSayilar += String.valueOf(sayi) + " ";
					asalMi = false;
					break;
				}else {
					asalMi = true;
				}
					
			}
			if (asalMi)
			{
				asalToplam += 1;
				asalSayilar += String.valueOf(sayi) + " ";
				asalMi = false;
			}
		}
		
		System.out.println("Asal toplam: " + asalToplam + " -  Asallar: " + asalSayilar);
		System.out.println("-----------------------------------------------------");
		System.out.println("Asal olmayan toplam: " + asalOlmayanToplam + " -  Asal olmayanlar: " + asalOlmayanSayilar);
	}

}
