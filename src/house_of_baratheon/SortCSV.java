
package house_of_baratheon;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class SortCSV {

    public static void readcsv(){ new ReadCSV().readCSV(); }

    public static void SortByName()
    {
        readcsv();       //Κλήση μεθόδου readcsv που είναι αναγκαία για τη ταξηνόμηση
        Collections.sort(ReadCSV.people, Comparator.comparing(Person::getName)); //Ταξηνόμηση με βάση το όνομα - JAVA8

        try {
            FileWriter writer = new FileWriter("./SortedCSV_Names&Genders.txt");
            for(Person s : ReadCSV.people)
            {
                writer.write(s.toString() + "\n");      //Εκτύπωση σε αρχείο txt
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}