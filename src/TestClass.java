import java.util.ArrayList;

import pk.po.laboratorium.*;

public class TestClass {


	public static void main(String[] args) {
		
		String rown;
		Onp kalkulator = new Onp();
		
		for(int ile =0;ile<args.length;ile++ )
		{
			System.out.println("Rownanie wejsciowe: "+args[ile]);
			rown=args[ile];
			System.out.println(rown);
			rown=rown.replaceAll("\\s","");
			System.out.println(rown);
			ArrayList<String> rownanieOnp = kalkulator.createOnpForm(rown);
			System.out.print("Rownanie onp: ");
			for(String s : rownanieOnp)
			{
				System.out.print(s+" ");
			}
			System.out.print("\nWynik:");
			System.out.println(kalkulator.getResult(rownanieOnp));
			System.out.println();
		}
	}

}
