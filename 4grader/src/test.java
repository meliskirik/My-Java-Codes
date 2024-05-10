import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınızı giriniz: ");
		String isim = scanner.nextLine();
		
		System.out.println("Soyadınızı giriniz: ");
		String soyisim = scanner.nextLine();
		
		System.out.println("Dersin adı: ");
		String ders = scanner.nextLine();
		
		System.out.println("Vize1 notunuzu giriniz: ");
		double vize1 = scanner.nextDouble();
		
		System.out.println("Vize2 notunuzu giriniz: ");
		double vize2 = scanner.nextDouble();
		
		System.out.println("Final notunuzu giriniz: ");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (vize1*0.3) + (vize2*0.3) + (finalNot*0.4);
		
		if(sonuc >= 60)
		{
			System.out.println(isim + " " + soyisim + " adlı ogrenci " + ders + " dersinden " + sonuc + " ortalamayla gecti " );
		}	
		
		else {
			System.out.println("kaldin");
		}
		
		
		
	}

}
