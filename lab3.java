import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        Task1();
        System.out.println("\n");
        Task2();
        System.out.println("\n");
        Task3();
        System.out.println("\n");
        Task4();
        System.out.println("\n");
        Task5();
        System.out.println("\n");
        Task6();
    }

    public static void Task1(){
        String someStr = "Напишите программу с методом для отображения текстовой строки в обратном порядке";
        StringBuilder reversedString = new StringBuilder(someStr);

        System.out.println(reversedString.reverse());
    }

    public static void Task2(){
        String someStr = "Напишите программу с методом для подсчета количества вхождений символа в текстовую строку";
        char someChar = 'п';

        int count = 0;

        for (int i = 0; i < someStr.length(); i++) {
            if(someStr.charAt(i) == someChar){
                count++;
            }
        }

        System.out.println(count);
    }

    public static void Task3(){
        String someStr = "Напишите\n программу\n с\n методомn,\n которым\n текст\n отображается\n в\n консоли,\n причем\n каждое\n слово\n из\n текста\n отображается\n в\n отдельной\n строке.";

        System.out.println(someStr);
    }

    public static void Task4(){
        Date date = new Date();
        long modifiedTime = date.getTime() + 1_000_000_000;
        Date newDate = new Date(modifiedTime);
        System.out.println(newDate);
    }

    public static void Task5(){
        Date date = new Date();
        long startDate = date.getTime();
        long timePeriod = 1_000_000_000;

        double randomOffset = Math.random() * timePeriod;

        Calendar c = Calendar.getInstance();
        c.setTime(new Date(startDate + (long)randomOffset));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }

    public static void Task6(){
        DateFormat df = new SimpleDateFormat("yyyy MM dd");
        System.out.println(df.format(new Date().getTime()));
    }
}
