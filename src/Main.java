import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Основной класс, в котором мы выбираем нужный нам пункт.
 */

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Select a category view:\n" +
                "1 - View the list of available for reading books, articles, journals and newspapers.\n" +
                "2 - View report on the pupils who have read more than 1 book\n" +
                "3 - View report on the pupils who have read less than or equal to 2 books");

        System.out.print("You chose the option: " );

        //Выбор нужного пункта с помощью консоли.
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();



        //Переход к нужному пункту для удобства.
        switch(id)
        {
            case 1: new Library().Start(); break;
            case 2: new ReportOne().Start(); break;
            case 3: new ReportTwo().Start(); break;
            default: System.out.println("Try again");
        }
    }
}
