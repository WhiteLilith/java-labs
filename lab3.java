public class Main
{
    public static void main(String[] args) {
        Task1();
        System.out.println("\n");
        Task2();
        System.out.println("\n");
        Task3();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
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
        String someStr = "Напишите\n программу\n с\n методомn,\n которымn\n текст\n отображаетсяn\n в\n консоли,\n причем\n каждое\n словоn\n из\n текста\n отображается\n в\n отдельной\n строке.";

        System.out.println(someStr);
    }

    public static void Task4(){

    }

    public static void Task5(){

    }
    
    public static void Task6(){
        
    }
}
