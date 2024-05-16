
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		// gise uygulamasi yapalim tc dogruysa numara versin yanlissa uyarsin

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gise Uygulamasina Hosgeldiniz!");
		System.out.print("Lutfen TC kimlik no giriniz : ");
		String tckn = scanner.nextLine();

		TCKN tcknNesne = new TCKN();
		tcknNesne.setTckn(tckn);

	}

}
