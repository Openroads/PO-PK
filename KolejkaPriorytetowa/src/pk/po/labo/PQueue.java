package pk.po.labo;

import java.util.Iterator;
import java.util.LinkedList;

//kolejka priorytetowa rosnaca 

public class PQueue <T extends Comparable<T>>{

	LinkedList<T> list ;

	public PQueue() {
		list = new LinkedList<T>();
	}

	public void add(T type)
	{
		if(list.isEmpty())
		{
			list.add(type);
			return;
		}
		else{
			int i=0;
			Iterator<T> it = list.iterator();
			while(it.hasNext())
			{
				//T ty = it.next();
				//System.out.println(ty);
				int compare = it.next().compareTo(type);
				//int compare = type.compareTo(ty);
				if(compare < 0 ) //jesli argument metody  > od elementu listy
				{
					list.add(i,type);
					return;

				}else if(compare ==0) //elementy rowne 
				{
					list.add(i,type);
					return;
				}
				else{//argument < od elementu

				}
				i++;
			}
		}

	}

	public T remove()  throws NullPointerException
	{
		if(!list.isEmpty())
		return list.remove(0);
		else
		return  null;
	
	}

	public T top()
	{
		return list.getFirst();

	}
}
