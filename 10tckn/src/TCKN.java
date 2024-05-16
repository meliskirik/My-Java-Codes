import java.util.Random;

public class TCKN {

	private Long id;

	private String dogumYeri;

	private String tckn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getTckn() {
		return tckn;
	}

	boolean kontrol = true;

	public void setTckn(String tckn) {
		if (tckn.length() == 11) {
			for (int i = 0; i < tckn.length(); i++) {
				char karakter = tckn.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
			}
			if (kontrol) {
				Random random = new Random();
				this.tckn = tckn;
				int giseNo = random.nextInt(100);
				sonucuYazdir("Gise No : " + giseNo);
			} else {
				sonucuYazdir("Lutfen tum karakterleri rakam olacak sekilde giriniz");
			}

		} else {
			sonucuYazdir("TC 11 karakter olmak zorunda.");
		}
		
	}

	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

}

