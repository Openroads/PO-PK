package pk.po.labo.kasafiskalna;

public class Pozycja {
	
 private String nazwaTowaru;
 private int ileSztuk;
 private double cena;
 
public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
	this.nazwaTowaru = nazwaTowaru;
	this.ileSztuk = ileSztuk;
	this.cena = cena;
}

public double obliczWartosc()
{
	return ileSztuk*cena;
}


@Override
public String toString() {
	return "Pozycja [nazwaTowaru=" + nazwaTowaru + ", cena=" + cena +" ileSztuk=" + ileSztuk +" wartosc wszystkich sztuk: "+obliczWartosc()+ "]";
}


}
