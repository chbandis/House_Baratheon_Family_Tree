package house_of_baratheon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintCSV {
    static List<Person> people = new LinkedList<Person>();     //Create object lists
    static List<Relation> relation = new ArrayList<Relation>();   

    public static void printCSV()
    {
        String csvFile = "./house_baratheon.csv";       //Store the path of the csv file in a string variable
        String line="";
        String csvSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            while ((line = br.readLine()) != null)
            {
                List<String> values = Arrays.asList(line.split(csvSplitBy));
                System.out.println(values);                     //Printing the contents of the csv file
                if (values.size() == 2)
                {
                    people.add(new Person(values.get(0), values.get(1)));   //Enter names and genders in the Object type list
                }                                                          
                else if (values.size() == 3)
                {
                    relation.add(new Relation(values.get(0), values.get(1), values.get(2)));   //Enter names and genders in the Object type list
                }                                                                             
            }
            br.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
