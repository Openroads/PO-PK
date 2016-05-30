package pk.po.labo.kasafiskalna;

import java.util.ArrayList;

public class Kasa {

	private String nip;
	private String nazwa;
	private String adres;
	private int numerUrzedzenia;
	private ArrayList <Paragon> paragony = new ArrayList<Paragon>();
	
	
	public Kasa(String nip, String nazwa, String adres, int numerUrzedzenia) {
		this.nip = nip;
		this.nazwa = nazwa;
		this.adres = adres;
		this.numerUrzedzenia = numerUrzedzenia;
	}
	
	public void dodajParagon(Paragon p)
	{
		paragony.add(p);
	}
	
	
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getNumerUrzedzenia() {
		return numerUrzedzenia;
	}
	public void setNumerUrzedzenia(int numerUrzedzenia) {
		this.numerUrzedzenia = numerUrzedzenia;
	}
	
	@Override
	public String toString() {
		return "Kasa [nip=" + nip + ", nazwa=" + nazwa + ", adres=" + adres + ", numerUrzedzenia=" + numerUrzedzenia
				+ "]"+ paragony;
	}
	
	public void drukujParagon(Paragon p)
	{
		System.out.println("Kasa [nip=" + nip + ", nazwa=" + nazwa + ", adres=" + adres + ", numerUrzedzenia=" + numerUrzedzenia
				+ "]" +p);
	}
	
}
