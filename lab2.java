import java.math.*;
import java.util.HashMap;
import java.util.Map;


public class Main
{
    public static void main(String[] args) {
        first14thTask();
        first18thTask();
        second14thTask();
        second18thTask();
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
        int[] someArr = {1, 5, 9, 8, 4, 6, 12, 3, 5, 1, 9, 5};
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
        int[][] matrix = {{1, 2, 3}, {3, 5, 7}, {5, 5, 5}, {7, 1, 7}};
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int minSumIndex = -1;
        int maxSumIndex = -1;

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }

            if(minSum > sum){
                minSumIndex = i;
                minSum = sum;
            }
            if(maxSum < sum){
                maxSumIndex = i;
                maxSum = sum;
            }
        }

        System.out.println(maxSumIndex + ": " + maxSum);
        System.out.println(minSumIndex + ": " + minSum);
    }

    public static void second18thTask(){
        int[][] matrix = {{1, 2, 3}, {3, 5, 7}, {5, 5, 5}, {7, 7, 7}};

        int[] rows = {0, 0, 0, 0};
        int[] columns = {0, 0, 0, 0};

        int row = 1;
        int column = 1;

        for(int i = 0; i < matrix.length; i++){
            row = 1;
            for (int j = 0; j < matrix[0].length; j++){
                row *= matrix[i][j];
            }
            rows[i] = row;
        }

        for(int i = 0; i < matrix[0].length; i++){
            column = 1;
            for (int j = 0; j < matrix.length; j++){
                column *= matrix[j][i];
            }
            columns[i] = column;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rows[i] == columns[j]){
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}
