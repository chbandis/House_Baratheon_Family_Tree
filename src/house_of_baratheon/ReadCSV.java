package house_of_baratheon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadCSV {
    static List<Person> people = new LinkedList<Person>();              //Create object lists
    static List<Relation> relation = new ArrayList<Relation>();           

    public static void readCSV() {
        String csvFile = "./house_baratheon.csv";               //Register the path of the csv file in a string variable
        String line = "";
        String delimiter = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                List<String> values = Arrays.asList(line.split(delimiter));
                if (values.size() == 2)
                {
                    people.add(new Person(values.get(0), values.get(1)));       //Store names and genders in the Object type list
                }                                                              
                else if (values.size() == 3)
                {
                    relation.add(new Relation(values.get(0), values.get(1), values.get(2)));    //Store names and genders in the Object type list
                }                                                                               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
