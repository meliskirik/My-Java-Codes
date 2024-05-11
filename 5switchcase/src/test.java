import java.nio.channels.NoConnectionPendingException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");
		String sayi = scanner.nextLine();
		
		switch (sayi) {
		case "1":
			System.out.println("pazartesi");
			break;
		case "2":
			System.out.println("sali");
			break;
		case "3":
			System.out.println("carsamba");
			break;
		case "4":
			System.out.println("persembe");
			break;
		case "5":
			System.out.println("cuma");
			break;
		case "6":
			System.out.println("cumartesi");
			break;
		case "7":
			System.out.println("pazar");
			break;

		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz ");
			break;
		}

	}

}
