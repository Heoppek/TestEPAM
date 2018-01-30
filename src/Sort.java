import javax.management.ObjectName;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Класс сортировки.
 */

public class Sort
{
    //Списки для сортировки.
    public ArrayList<String> Available = new ArrayList<String>();
    private ArrayList<String> helpsort = new ArrayList<String>();
    public ArrayList<Date> age = new ArrayList<Date>();


    //Добавление в список с файла.
    public void Add(Scanner file)
    {
        while (file.hasNextLine())
        {
            Available.add(file.nextLine());
        }
    }

    //Сортировка по имени.
    public void SortName(Scanner file)
    {
        //Вызов метода для добавления в список.
        Add(file);

        Collections.sort(Available);
    }

    //Сортировка по возрасту.
    public void SortForDate(Scanner file) throws Exception
    {
        //Вызов метода для добавления в список.
        Add(file);

        for(int i=0; i<Available.size();i++)
        {
            String[] split = Available.get(i).split(": ");
            if (split[1].equals("2"))
            {
                helpsort.add(Available.get(i));
            }
        }

        Available=helpsort;

        for(int i=0; i<Available.size();i++)
        {
                String[] split1 = Available.get(i).split(": ");
                String[] split2 = split1[0].split(", ");
                SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                age.add(formatter.parse(split2[1]));
        }

        Collections.sort(age);
    }

}
