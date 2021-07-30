package oyun;

import oyun.business.concretes.OyunYonetim;
import oyun.core.Dogrulama;
import oyun.entities.concretes.EDevlet;
import oyun.entities.concretes.Musteri;
import oyun.entities.concretes.Oyun;

public class Main {

	public static void main(String[] args) {
		Musteri musteri = new Musteri("Seyma", "122222244568", "Aydýn", 1999);
		EDevlet dogrusu = new EDevlet("Seyma", "122222244568", "Aydýn", 1999);	
		OyunYonetim prog = new OyunYonetim();
		Oyun oyun = new Oyun("GTA5", "123456", 55,14);
		
		Dogrulama dog = new Dogrulama(dogrusu, musteri);
		dog.dogruMu();
		prog.oyunSatýnAl(musteri,oyun);
	}

}
