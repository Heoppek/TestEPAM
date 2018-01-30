import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/*
В этом классе выполняется 3 пункт
 */

public class ReportTwo
{
    public void Start() throws Exception
    {
        //Считывание и запись с файлов.
        FileReader ReportTwo = new FileReader( "C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\ReportTwo.txt" );
        Scanner scanner = new Scanner(ReportTwo);

        FileWriter Report = new FileWriter("C:\\Users\\Heop\\IdeaProjects\\EPAMSCHOOLLIBRARY\\src\\Report.txt");

        //Вызов сортировки по Дате рождения.
        Sort Sort =  new Sort();
        Sort.SortForDate(scanner);

        //Вывод учеников, которые прочли 2 книги.
        System.out.println("List:");

        for (int i=0; i<Sort.age.size();i++)
        {
            for(String counter : Sort.Available)
            {
                String[] split1 = counter.split(": ");
                String[] split2 = split1[0].split(", ");
                SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                Date compared1 = formatter.parse(split2[1]);

                if (!compared1.after(Sort.age.get(i)) && !compared1.before(Sort.age.get(i)))
                {
                    System.out.println(counter);
                    Report.write(counter + "\n");
                    break;
                }
            }

        }

        System.out.print("Information is displayed in the console and written to a file Report.txt");
        Report.write("It's all the students who read the books.");

        ReportTwo.close();
        Report.close();
    }
}
