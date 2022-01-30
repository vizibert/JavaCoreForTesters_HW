package HW5;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args) {

    List <Values> valuesList = new ArrayList<>();

    Values value1 = new Values(100, 101, 102);
    Values value2 = new Values(200, 201,202);
    Values value3 = new Values(300, 301,302);
    valuesList.add(0,value1);
    valuesList.add(1,value2);
    valuesList.add(2,value3);


    save(valuesList);
    upload(valuesList);

}

    public static void save(List <Values> valuesList) {
        try(
                PrintWriter out = new PrintWriter("homework.csv"))
        {
            out.println("Value1;Value2;Value3");
            for (Values v : valuesList) {
                out.println(v);
            }
        } catch(
                IOException e)

        {
            e.printStackTrace();
        }
    }

    public static void upload(List <Values> valuesList) {
        try (BufferedReader in = new BufferedReader(new FileReader("homework2.csv"))) {
            String result = null;
            in.readLine(); // вычитка первой строки
            while ((result = in.readLine()) != null) {
                String[] tokens = result.split(";");
                Values values = new Values (Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                valuesList.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        valuesList.forEach(System.out::println);
    }
}