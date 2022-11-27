
package house_of_baratheon;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class SortCSV {

    public static void readcsv(){ new ReadCSV().readCSV(); }

    public static void SortByName()
    {
        readcsv();       //Call readcsv method necessary for classification
        Collections.sort(ReadCSV.people, Comparator.comparing(Person::getName)); //Sort by name - JAVA8

        try {
            FileWriter writer = new FileWriter("./SortedCSV_Names&Genders.txt");
            for(Person s : ReadCSV.people)
            {
                writer.write(s.toString() + "\n");      //Print to txt file
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
