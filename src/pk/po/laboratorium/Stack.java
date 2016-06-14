package pk.po.laboratorium;

import java.util.LinkedList;

public class Stack <T> {
	
	LinkedList<T> tablica;
	
	/**
	 * 
	 * @param length dlugosc tablicy
	 */
	public Stack()
	{
		tablica = new LinkedList<T>();
	}
	public void add(T znak)
	{
		tablica.addLast(znak);
	}
	
	
	public T showTop()
	{
		return tablica.getLast();
	}
	
	public T getTop()
	{
		if(!tablica.isEmpty())
		return tablica.removeLast();
		else return null;
	}
	public boolean isEmpty()
	{
		return tablica.isEmpty();
	}
	public void showStack()
	{
		for(T t : tablica)
		{
			System.out.println(t);
		}
	}

}
