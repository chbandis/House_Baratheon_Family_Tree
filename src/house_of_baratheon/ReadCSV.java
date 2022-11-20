package house_of_baratheon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadCSV {
    static List<Person> people = new LinkedList<Person>();              //Δημιουργία λίστας τύπου object
    static List<Relation> relation = new ArrayList<Relation>();           //Δημιουργία λίστας τύπου object

    public static void readCSV() {
        String csvFile = "./house_baratheon.csv";               //Καταχώρηση του path του csv αρχείο σε  μεταβλητή τύπου String
        String line = "";
        String delimiter = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                List<String> values = Arrays.asList(line.split(delimiter));
                if (values.size() == 2)
                {
                    people.add(new Person(values.get(0), values.get(1)));       //Εισαγωγή ονομάτων και φύλων στη λίστα
                }                                                               //τύπου Object
                else if (values.size() == 3)
                {
                    relation.add(new Relation(values.get(0), values.get(1), values.get(2)));    //Εισαγωγή ονομάτων και φύλων στη λίστα
                }                                                                               // τύπου Object
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}