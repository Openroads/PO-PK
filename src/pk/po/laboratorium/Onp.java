package pk.po.laboratorium;

import java.util.ArrayList;

public class Onp {

public  ArrayList<String> createOnpForm(String rownanie)
	{
		Stack stos = new Stack(rownanie.length());
		char dana;
		String liczba ="";
		ArrayList<String> wynik = new ArrayList<String>();	
		for(int i=0;i<rownanie.length();i++){
			dana =rownanie.charAt(i);
			if(dana=='=')
			{
				while(stos.isEmpty()==false)
				{
					wynik.add(stos.getTop());
				}
				//break;
			}
			else if(dana>='0' && dana <='9'){
				liczba=String.valueOf(dana);
				
				while(rownanie.charAt(i+1)>='0' && rownanie.charAt(i+1) <='9'){
					i++;
					dana=rownanie.charAt(i);
					liczba+=String.valueOf(dana);
					}
				if(rownanie.charAt(i+1)=='.'){
					i++;
					liczba+=".";
					while(rownanie.charAt(i+1)>='0' && rownanie.charAt(i+1) <='9'){
						i++;
						dana=rownanie.charAt(i);
						liczba+=String.valueOf(dana);
						}
				}
				wynik.add(liczba);		
			}else{
				switch(dana)
				{
				case'(':	
					stos.add(dana);
					break;
				case')':
					while(stos.showTop().equals("(")==false)
					{
						wynik.add(stos.getTop());
					}
					stos.getTop();//sciagniecie nawiasu "("
					break;
				case'+': 
				case'*': 
				case'-': 
				case'/': 
				case'^':
				case'v':
					while(stos.isEmpty()==false)
					{
						if(getOperatorPriority(dana)==3 || (getOperatorPriority(dana)>(getOperatorPriority((stos.showTop().charAt(0))))))
								{
									break;
								}
						wynik.add(stos.getTop());
					}
					stos.add(dana);
					break;
				default:
					System.out.println("Nie poprawny znak w równaniu");
					System.out.println(dana);
				}
			}
			
		}
		return wynik;
	}

	public static int getOperatorPriority(char d)
	{
		switch(d)
		{
		case'+':
		case'-':
			return 1;
		case'*':
		case'/':
		case'%':
		case'x':
			return 2;
		case'^':
		case'v':
		case'V':
			return 3;
		case'(':
			return 0;
		default:
			System.out.println("Bledny operator");
			
		}return 0;
	}
	
	public  double getResult(ArrayList<String> rownanie)
	{
		Stack stos = new Stack(rownanie.size());
		double temporary,temporary2;
		for(String dana : rownanie)
		{
			switch(dana)
			{
			case"+":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = temporary+Double.parseDouble(stos.getTop());
				stos.add(temporary2);
				break;
			case"-":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = Double.parseDouble(stos.getTop())-temporary;
				stos.add(temporary2);
				break;
			case"*":
			case"x":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = temporary*Double.parseDouble(stos.getTop());
				stos.add(temporary2);
				break;
			case"/":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = Double.parseDouble(stos.getTop())/temporary;
				stos.add(temporary2);
				break;
			case"%":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = temporary%Double.parseDouble(stos.getTop());
				stos.add(temporary2);
				break;
			case"^":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = Math.pow(Double.parseDouble(stos.getTop()),temporary);
				stos.add(temporary2);
				break;
			case"v":
			case"V":
				temporary = Double.parseDouble(stos.getTop());
				temporary2 = sqrt(temporary,Double.parseDouble(stos.getTop()));
				stos.add(temporary2);
				break;
				
			default:
				stos.add(dana);
				
			}
			
		}
		double wynik=Double.parseDouble(stos.getTop());
		
		return wynik;
	}
	public static double sqrt(double grade, double number)
	{
		return Math.pow(number, (double)1/grade);
	}

}

