package house_of_baratheon;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;


public class WriteToFile {
    public static void write() throws Exception {               //Εξαγωγή αρχείου .dot
        try {
            FileWriter myWriter = new FileWriter("got.dot");
            myWriter.write("digraph Got {\n" +
                    "rankdir=LR;\n" +
                    "size=\"8,5\"\n" +
                    "node [shape = rectangle] [color=black];\n" +
                    "\n" +
                    "\"Robert Baratheon\" -> \"Cersei Lannister\" [label=\"husband\"];\n" +
                    "\"Robert Baratheon\" -> \"Gendry\" [label=\"father\"];\n" +
                    "\"Cersei Lannister\" -> \"Robert Baratheon\" [label=\"wife\"];\n" +
                    "\"Cersei Lannister\" -> \"Joffrey Baratheon\" [label=\"mother\"];\n" +
                    "\"Cersei Lannister\" -> \"Myrcella Baratheon\" [label=\"mother\"];\n" +
                    "\"Cersei Lannister\" -> \"Tommen Baratheon\" [label=\"mother\"];\n" +
                    "\"Stannis Baratheon\" -> \"Selyse Baratheon\" [label=\"husband\"];\n" +
                    "\"Stannis Baratheon\" -> \"Shireen Baratheon\" [label=\"father\"];\n" +
                    "\"Selyse Baratheon\" -> \"Stannis Baratheon\" [label=\"wife\"];\n" +
                    "\"Selyse Baratheon\" -> \"Shireen Baratheon\" [label=\"mother\"];\n" +
                    "\"Renly Baratheon\" -> \"Margaery Tyrell\" [label=\"husband\"];\n" +
                    "\"Margaery Tyrell\" -> \"Renly Baratheon\" [label=\"wife\"];\n" +
                    "\"Steffon Baratheon\" -> \"Cassana Estermont\" [label=\"husband\"];\n" +
                    "\"Steffon Baratheon\" -> \"Robert Baratheon\" [label=\"father\"];\n" +
                    "\"Steffon Baratheon\" -> \"Stannis Baratheon\" [label=\"father\"];\n" +
                    "\"Steffon Baratheon\" -> \"Renly Baratheon\" [label=\"father\"];\n" +
                    "\"Cassana Estermont\" -> \"Steffon Baratheon\" [label=\"wife\"];\n" +
                    "\"Cassana Estermont\" -> \"Robert Baratheon\" [label=\"mother\"];\n" +
                    "\"Cassana Estermont\" -> \"Stannis Baratheon\" [label=\"mother\"];\n" +
                    "\"Cassana Estermont\" -> \"Renly Baratheon\" [label=\"mother\"];\n" +
                    "}");

            myWriter.close();
                                                                                 //Δημιουργία αρχείου jpg μέσω cmd
            Process process = Runtime.getRuntime().exec("cmd /c dot -Tjpg ./got.dot -o ./got.jpg");

            Thread.sleep(1500);         //Καθυστέριση την εκτέλεσης κατά 1,5 δευτερόλεπτα ώστε να λειτουργήσει ο
                                            // παρακάτω έλεγχος
            File f = new File("./got.jpg");
            if(f.exists() && !f.isDirectory()) {
                System.out.println("Τα αρχεία got.dot και got.jpg εξήχθει επιτυχώς!");
            }else{
                System.out.println("Σφάλμα το αρχείο δεν δημιουργήθηκε ");
            }


        } catch (IOException | InterruptedException e) {
            System.out.println("Σφάλμα.");
            e.printStackTrace();
        }
    }
}
