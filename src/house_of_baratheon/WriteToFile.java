package house_of_baratheon;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;


public class WriteToFile {
    public static void write() throws Exception {               //Export the .dot file
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
                                                                                 //Create jpg file via cmd
            Process process = Runtime.getRuntime().exec("cmd /c dot -Tjpg ./got.dot -o ./got.jpg");

            Thread.sleep(1500);         //Delay execution by 1.5 seconds for the following check to work
                                            
            File f = new File("./got.jpg");
            if(f.exists() && !f.isDirectory()) {
                System.out.println("The got.dot and got.jpg files were successfully extracted!");
            }else{
                System.out.println("Error file not created");
            }


        } catch (IOException | InterruptedException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
