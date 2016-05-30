package pk.po.labo.kasafiskalna;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Paragon {
	
 private Pozycja pozycje[];
 private int ileDodanych;
 private int maksymalnyRozmiar;
 
 public Paragon()
 {
	 maksymalnyRozmiar=10;
	 pozycje=new Pozycja[10];
 }
 
 public Paragon(int rozmiar){
	 
	 this.maksymalnyRozmiar=rozmiar;
	 pozycje=new Pozycja[maksymalnyRozmiar];
 
 }
 
 public void dodajPozycje(Pozycja p)
 {
	 if(ileDodanych<maksymalnyRozmiar){
	 pozycje[ileDodanych++]=p;}
	 else{
		 System.out.println("Za duzo pozycji");
	 }
 }
 
public double obliczWartosc()
{
	double suma=0;
	for(Pozycja p:pozycje)
	{
		suma+=p.obliczWartosc();
	}
	return suma;
}
 
@Override
public String toString() {
	return "Paragon [pozycje=" + Arrays.toString(pozycje)+"Suma: "+obliczWartosc()+" zl "+"Date: "+LocalDate.now()+" " + LocalTime.now();
}
//to string zwracajacy nazwe o sklepie, pojebane to jest troche bo ta informacja jest w kasie chyba ze zle rozumiem to zadanie
public String toString(Kasa k) {
	return "Kasa: "+k+" Paragon [pozycje=" + Arrays.toString(pozycje)+"Suma: "+obliczWartosc()+" zl "+"Date: "+LocalDate.now()+" " + LocalTime.now();
}
}

