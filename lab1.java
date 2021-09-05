import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String someStr = bufferedReader.readLine();
        System.out.println(someStr);


        JOptionPane.showMessageDialog(null, "Всем большой привет!");
        String name;
        name=JOptionPane.showInputDialog("Привет, как Вас зовут?");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться, \n"+name+"!");
    }

}