import java.math.*;
import java.util.HashMap;
import java.util.Map;


public class Main
{
    public static void main(String[] args) {
        first18thTask();
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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < someArr.length; i++){
            if(map.containsKey(someArr[i])){
                map.replace(someArr[i], map.get(someArr[i]) + 1);
            }
            else{
                map.put(someArr[i], 1);
            }
        }

        int minKey = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue() == maxVal){
                if((int)entry.getKey() < minKey){
                    minKey = (int)entry.getKey();
                }
            }
            if((int)entry.getValue() > maxVal){
                maxVal = (int)entry.getValue();
                minKey = (int)entry.getKey();
            }
        }

        System.out.println(minKey + ": " + maxVal);
    }

    public static void second14thTask(){

    }

    public static void second18thTask(){

    }
}
