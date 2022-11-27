//Not used 
package house_of_baratheon;


import java.util.*;



public class Graph<Relation> {


    private Map<Relation,  List<Relation>> map = new HashMap<>();

    public void addVertex(Relation s) { map.put(s, new LinkedList<Relation>());}   //Method for creating vertex



    public void addEdge(Relation source, Relation destination, boolean bidirectional) { //Method to create edge

        if (!map.containsKey(source)) {
            addVertex(source);                      //Entering a value in the first vertex

        }
        if (!map.containsKey(destination)) {
            addVertex(destination);                 //Entering a value in the second vertex

        }
        map.get(source).add(destination);           //Create a connection - edge

        if (bidirectional == true) {
            map.get(destination).add(source);      //Creating a reverse connection due to a directed graph
        }

    }

    public void hasEdge(Relation s, Relation d) {           //Show relation between vertex

        if (map.get(s).contains(d)) {
           System.out.println("There is a relation between him/her " + s + " and him/her " + d + "." );
        } else {
            System.out.println("There is no relation between him/her " + s + " and him/her " + d + ".");
        }
    }

    public static void readcsv() { new ReadCSV().readCSV(); }       //Call methods from other classes
    public void printGraph() {

        readcsv();                           //Call readcsv method necessary for classification
        Graph g = new Graph();


        g.addEdge("Robert Baratheon", "Cersei Lannister", true);
        g.addEdge("Robert Baratheon", "Gendry", true);
        g.addEdge("Cersei Lannister", "Joffrey Baratheon", true);
        g.addEdge("Cersei Lannister", "Myrcella Baratheon", true);
        g.addEdge("Cersei Lannister", "Tommen Baratheon", true);
        g.addEdge("Stannis Baratheon", "Selyse Baratheon", true);
        g.addEdge("Stannis Baratheon", "Shireen Baratheon", true);
        g.addEdge("Selyse Baratheon", "Shireen Baratheon", true);
        g.addEdge("Renly Baratheon", "Margaery Tyrell", true);
        g.addEdge("Steffon Baratheon", "Cassana Estermont", true);
        g.addEdge("Steffon Baratheon", "Robert Baratheon", true);
        g.addEdge("Steffon Baratheon", "Stannis Baratheon", true);
        g.addEdge("Steffon Baratheon", "Renly Baratheon", true);
        g.addEdge("Cassana Estermont", "Robert Baratheon", true);
        g.addEdge("Cassana Estermont", "Stannis Baratheon", true);
        g.addEdge("Cassana Estermont", "Renly Baratheon", true);


        String name1, name2;
        Scanner onoma1 = new Scanner(System.in);
        Scanner onoma2 = new Scanner(System.in);


        System.out.print("Enter first name: ");
        name1 = onoma1.nextLine();

        System.out.print("Enter second name: ");
        name2 = onoma2.nextLine();

         g.hasEdge(name1, name2);       //Call the method to display a relation

    }
}
