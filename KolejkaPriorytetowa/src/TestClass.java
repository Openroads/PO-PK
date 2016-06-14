import pk.po.labo.PQueue;

public class TestClass {
	public static void main(String args[]){
		
	/*PQueue<String> kolejkastring = new PQueue<String>();
	kolejkastring.add("Janek");
	kolejkastring.add("Franek");
	System.out.println(kolejkastring.top());
	
	kolejkastring.add("Piotrek");
	System.out.println(kolejkastring.remove());
	kolejkastring.add("AAAaa");
	kolejkastring.add("Tomek");*/
	
	//System.out.println(kolejka.top());
	
	PQueue<Integer> kolint = new PQueue<Integer>();
	
	kolint.add(2);
	kolint.add(3);
	kolint.add(5);
	kolint.add(1);
	System.out.println(kolint.top());
	kolint.add(2);
	System.out.println(kolint.remove());
	System.out.println(kolint.top());
	for(int i =0; i<4;i++)
	{
		System.out.println(kolint.remove());
	}
	System.out.println(kolint.top());
	
	
	String a = "a";
	String b = "c";
	
	System.out.println(a.compareTo(b));
/*	Integer i = new Integer(4);
	System.out.println(i.compareTo(10));*/
	}
	

}
