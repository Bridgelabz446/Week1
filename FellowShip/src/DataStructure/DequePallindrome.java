package DataStructure;

	import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

	public class DequePallindrome {

		static boolean ispallindrom(Deque<Character> dq) {
			if (dq.size() % 2 == 0) {
				while (dq.size() != 0) {
					char c1 = dq.removeFirst();
					char c2 = dq.removeLast();
					if (c1 != c2) {
						return false;
					}
				}
			} else {
				while (dq.size() == 1) {
					char c1 = dq.removeFirst();
					char c2 = dq.removeLast();
					if (c1 != c2) {
						return false;
					}
				}
			}
			return true;
		}

		public static void main(String[] args) {
			Scanner st = new Scanner(System.in);
			System.out.println("enter a string");
			String s1 = st.nextLine();
		Deque<Character>dq=new Deque<Character>() {
			
			@Override
			public <T> T[] toArray(T[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean removeLastOccurrence(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Character removeLast() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean removeFirstOccurrence(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Character removeFirst() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Character remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void push(Character arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Character pop() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character pollLast() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character pollFirst() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character peekLast() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character peekFirst() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offerLast(Character arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean offerFirst(Character arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean offer(Character arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<Character> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character getLast() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character getFirst() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Character element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterator<Character> descendingIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void addLast(Character arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addFirst(Character arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends Character> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean add(Character arg0) {
				// TODO Auto-generated method stub
				return false;
			}
		};
			
			int i = 0;
			while (i < s1.length()) {
				dq.add(s1.charAt(i++));
			}
			System.out.println(dq + " " + dq.size());
			System.out.println(ispallindrom(dq));
		}
	}


