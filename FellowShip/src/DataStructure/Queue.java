package DataStructure;

public class Queue implements Comparable {
		 String name;
		 long balance;
		
		public  Queue (String name,long amount)
		{
			this.name=name;
			this.balance=amount;	
		}

		@Override
		public int compareTo(Object o) {
			
			return 0;
		}
		
		public  static long withdrawAmount(Long amount)
		{
			
			return 0;
		}
		
		
		public static long depositAmount(long amount)
		{
			return 0;
		}
		
	     
	     @Override
	    public String toString() {
	    	
	    	return String.valueOf(balance);
	    }
	}


