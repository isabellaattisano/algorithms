package hashing;

public class Hashing {
	final static int n = 10;
	static pair[] objects = new pair[n];
	static int[] ints = new int[n];
	
	
	public static void main(String[] args) {
		
		insertElement(new pair<String>("one", "one"));
		insertElement(new pair<String>("two", "two"));
		insertElement(new pair<String>("three", "three"));
		insertElement(new pair<String>("four", "four"));
		System.out.println(findElement("four"));
		insertElement(new pair<Integer>(1,1));
		insertElement(new pair<Integer>(34, 56));
		System.out.println(findElement(34));
		
		for(pair p : objects) {
			if(p == null)
				System.out.println("null");
			else
				System.out.println("key: " + p.key + " val: " + p.val);
		}
		
		removeElement("two");
		
		System.out.println("==================");
		
		for(pair p : objects) {
			if(p == null)
				System.out.println("null");
			else
				System.out.println("key: " + p.key + " val: " + p.val);
		}
		
	}
	
	static void removeElement(Object key) {
		
		if(findElement(key) == null)
			return;
		
		int hashVal;
	
		if(key instanceof String) 
			 hashVal = hashString((String)key);
		
		else 
			 hashVal = hashInt((int)key);
		
		objects[hashVal] = null;
		
		int index = hashVal+1;
		
		while(objects[index] != null) {
			System.out.println("index: " + index + " " + objects[index].key);
			pair temp = objects[index];
			objects[index] = null;
			insertElement(temp);
			index = (index + 1) % n;
		}
		
		
		
	}
	
	static Object findElement(Object key) {
		int hashVal;
		if(key instanceof String) {
			 hashVal = hashString((String)key);
			 
			 if(objects[hashVal] != null && objects[hashVal].key.equals((String)key)) 
				return objects[hashVal].val;
			 
			 else {
				int index = hashVal+1;
					
				while(index != hashVal) {
					if(objects[index] != null && objects[index].key.equals((String)key)) 
						return objects[index].val;
					else 
						index = (index +1) % n; 
							
				}
					
				return null;
			}
				 	
		}
		else {
			 hashVal = hashInt((int)key);
			 if(objects[hashVal] != null && objects[hashVal].key == key) 
					return objects[hashVal].val;
				 
			 else {
				int index = hashVal+1;
						
					while(index != hashVal) {
						if(objects[index] != null && objects[index].key == key) 
							return objects[index].val;
						else 
							index = (index +1) % n; 
								
					}
						
					return null;
				}
		
		}
		
	}
	
	static boolean insertElement(pair p) {
		int hashVal;
		if(p.key instanceof String)
			 hashVal = hashString((String)p.key);
		else
			 hashVal = hashInt((int)p.key);
		
		if(objects[hashVal] == null) {
			objects[hashVal] = p;
			return true;
		}
		else {
			int index = hashVal+1;
			while(index != hashVal) {
				if(objects[index] == null) {
					objects[index] = p;
					return true;
				}
				else {
					index = (index +1) % n; 
				}	
			}
			
			return false;
		}
		
	}
	
	static int hashString(String key) {
		//used closed hashing 
		
		int sum =0;
		for(int i =0; i<key.length(); i++) {
			sum+=(int) key.charAt(i);
		}
		System.out.println(sum%n);
		return sum % n;
		
	}
	
	static int hashInt(int key) {
		System.out.println(key%n);
		return key % n;
	}

}

class pair<T>{
	T key;
	T val;
	
	pair(T key, T val){
		this.key = key;
		this.val = val;
	}
}
