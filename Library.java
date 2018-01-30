import java.io.*;
import java.util.*;

/*
В этом классе выполняется 1 пункт.
 */

public class Library
{

    public void Start() throws Exception
    {
        //Считывание и запись с файлов.
        FileReader Library = new FileReader("C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\AvailableBooks.txt");
        Scanner scanner = new Scanner(Library);

        FileWriter Report = new FileWriter("C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\Report.txt");

        //Вызов сортировки по алфавиту доступных произведений.
        Sort Sort =  new Sort();
        Sort.SortName(scanner);

        //Вывод доступных произведений.
        System.out.println("List:");

        for(String counter : Sort.Available)
        {
            System.out.println(counter);
            Report.write(counter + "\n");
        }

        System.out.print("Information is displayed in the console and written to a file Report.txt");
        Report.write("These are all books.");

        Library.close();
        Report.close();
    }
}
