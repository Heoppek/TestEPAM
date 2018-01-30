import java.io.*;
import java.util.*;

/*
В этом классе выполняется 2 пункт.
 */

public class ReportOne
{
    public void Start() throws Exception
    {
        //Считывание и запись с файлов.
        FileReader ReportOne = new FileReader( "C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\ReportOne.txt" );
        Scanner scanner = new Scanner(ReportOne);

        FileWriter Report = new FileWriter("C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\Report.txt");

        //Вызов сортировки по имени для удобства просмотра списка учеников.
        Sort Sort =  new Sort();
        Sort.SortName(scanner);

        //Вывод всех учеников, которые прочли 2 книги.
        System.out.println("List:");

        for(String counter : Sort.Available)
        {
            String[] split = counter.split(" ");
            if(split[1].equals("2"))
            {
                System.out.println(counter);
                Report.write(counter + "\n");
            }
        }

        System.out.print("Information is displayed in the console and written to a file Report.txt");
        Report.write("It's all the students who read the books.");

        ReportOne.close();
        Report.close();
    }
}
