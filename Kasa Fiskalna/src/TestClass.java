import pk.po.labo.kasafiskalna.Kasa;
import pk.po.labo.kasafiskalna.Paragon;
import pk.po.labo.kasafiskalna.Pozycja;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pozycja mleko= new Pozycja("Mleko",3,2.8),
				chleb = new Pozycja("Chleb",2,2.5),
				cola = new Pozycja("Coca Cola",2,5.5),
				batonik = new Pozycja("Snikers",2,3.0),
				ciastka = new Pozycja("Markizy",3,8.5),
				maslo = new Pozycja("Maslo",1,5),
				zupka = new Pozycja("Chinska",2,3.5),
				jaja = new Pozycja("DuzeJaja :D",10,8);
		Pozycja kielbasa = new Pozycja("Tradycyjna",5,11.5);
		
		Paragon p1 = new Paragon(3);
		Paragon p2 = new Paragon(5);
		Paragon p3 = new Paragon(1);
		
		p1.dodajPozycje(mleko); 	p1.dodajPozycje(chleb);		p1.dodajPozycje(cola);
		
		p2.dodajPozycje(batonik);	p2.dodajPozycje(ciastka);	p2.dodajPozycje(maslo);
		p2.dodajPozycje(zupka);		p2.dodajPozycje(jaja);	
		
		p3.dodajPozycje(kielbasa);
		
		Kasa kasafislakna = new Kasa("989865","Biedronka","Krakow Warszawska 18",51);
		kasafislakna.dodajParagon(p1);
		kasafislakna.dodajParagon(p2);
		kasafislakna.dodajParagon(p3);
		
		kasafislakna.drukujParagon(p1);
		kasafislakna.drukujParagon(p2);
		kasafislakna.drukujParagon(p3);
		
		System.out.println("Raport dobowy: ");
		System.out.println(kasafislakna);
		
		System.out.println(p2.toString(kasafislakna));
	}

}
