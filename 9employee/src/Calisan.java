
public class Calisan {

	public int no;
	public String isim;
	public String soyisim;
	public int tecrube;
	public double maas;

	public Calisan() {

	}

	public Calisan(int no, String isim, String soyisim, int tecrube, double maas) {
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.tecrube = tecrube;
		this.maas = maas;
	}

	public void calisanBilgileriniGoster() {
		System.out.println("***********CALISAN BİLGİLERİ**********");
		System.out.println("No        : " + no);
		System.out.println("İsim      : " + isim);
		System.out.println("Soyisim   : " + soyisim);
		System.out.println("Tecrube   : " + tecrube);
	}

	public void zamYap(int zamDegeri) {
		System.out.println("Maasınıza " + zamDegeri + " TL zam yapildi.");
		System.out.println("Suanki guncel maasınız : " + (maas + zamDegeri));
	}

	public void formatAt(String isletimSistemi, String kim) {
		System.out.println(kim + " su anda " + isletimSistemi + " isletim sistemine format atiyor.");
	}

}
