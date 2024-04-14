package labs;
import java.util.ArrayList;
public class Stack extends java.util.ArrayList{
	
	public int getSize() {
		return super.size();
	}
	
	
	public void push(Object item) {
		add(item);
		
	}
	
	public Object pop() {
		Object item = get(getSize()-1);
		remove(getSize()-1);
		return item;
		
	}
	
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(5);
		s1.push(6.9878);
		s1.push(7);
		s1.push(8);
		
		
		
		System.out.println(s1);
		s1.pop();
		
		System.out.println(s1);
		
		
		
		
	}
	
	
	
	
	
}
