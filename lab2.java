import java.math.*;
public class Main
{
	public static void main(String[] args) {
		first14thTask();
	}
	
	public static void first14thTask(){
	    int[] someArr = {1, 5, 9, 8, 4, 6, 12, 3, 5};
	    int sum = 0;
	    
	    for(int i = 0; i < someArr.length; i++){
	        BigInteger bigInteger = BigInteger.valueOf(i);
	        if(bigInteger.isProbablePrime((int) Math.log(i))){
	            sum += someArr[i];
	        }
	    }
	    
	    System.out.println(sum);
	}
	
	public static void first18thTask(){
	    int[] someArr = {1, 5, 9, 8, 4, 6, 12, 3, 5, 1, 9};
	    Map<int, int> map = new HashMap<int, int>();
	    
	    for(int i = 0; i < someArr.length; i++){
	        if(map.containsKey(someArr[i])){
	            map.replace(someArr[i], map.get(someArr[i]) + 1);
	        }
	        else{
	            map.put(someArr[i], 1);
	        }
	    }
	    
	    
	}
	
	public static void second14thTask(){
	    
	}
	
	public static void second18thTask(){
	    
	}
}
