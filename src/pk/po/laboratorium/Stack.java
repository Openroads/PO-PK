package pk.po.laboratorium;

public class Stack {
	
	String tablica[];
	int stackPointer=-1;
	int wielkosc;
	/**
	 * 
	 * @param length dlugosc tablicy
	 */
	public Stack(int length)
	{
		wielkosc=length;
		tablica = new String[length];
	}
	public void add(String znak)
	{
		if(stackPointer<wielkosc){
		tablica[++stackPointer]=znak;
		}else{System.out.println("Stos przepełniony");}
	}
	public void add(char znak)
	{
		if(stackPointer<wielkosc){
		tablica[++stackPointer]=String.valueOf(znak);
		}
		else{System.out.println("Stos przepełniony");}
	}
	
	public void add(double liczba)
	{
		if(stackPointer<wielkosc){
			tablica[++stackPointer]=String.valueOf(liczba);
		}else{System.out.println("Stos przepełniony");}
		
	}
	
	public String showTop()
	{
		if(stackPointer>=0)
		return tablica[stackPointer];
		else{
			System.out.println("Stos pusty");
			return "-1";}
	}
	
	public String getTop()
	{
		if(stackPointer>=0)
		return tablica[stackPointer--];
		return "-1";
	}
	public boolean isEmpty()
	{
		if(stackPointer>=0)
		return false;
		else return true;
	}
	public void showStack()
	{
		for(int i=0;i<=stackPointer;i++){
			System.out.print(tablica[i]);
		}
	}

}
