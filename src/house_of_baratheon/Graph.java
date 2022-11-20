//Σε αυτό το σημείο του κώδικα καταφέραμε να δημιουργήσουμε ένα γράφο οποίος εμφανίζει ότι υπάρχει σχέση μεταξύ των
//δύο nodes αλλά δε καταφέραμε να το κάνουμε να εμφανίζει τι είδους σχέση έχουν, οπότε καταλήξαμε στο να δημιουργήσουμε
//και να χρησιμοποιήσουμε τη κλάση FindRelation.java
package house_of_baratheon;


import java.util.*;



public class Graph<Relation> {


    private Map<Relation,  List<Relation>> map = new HashMap<>();

    public void addVertex(Relation s) { map.put(s, new LinkedList<Relation>());}   //Μέθοδος για τη δημιουργία vertex



    public void addEdge(Relation source, Relation destination, boolean bidirectional) { //Μέθοδος για τη δημιουργία edge

        if (!map.containsKey(source)) {
            addVertex(source);                      //Εισαγωγή τιμής στο πρώτο vertex

        }
        if (!map.containsKey(destination)) {
            addVertex(destination);                 //Εισαγωγή τιμής στο δέυτερο vertex

        }
        map.get(source).add(destination);           //Δημιουργία σύνδεσης - edge

        if (bidirectional == true) {
            map.get(destination).add(source);      //Δημιουργία αντίστροφης σύνδεσης λόγω κατευθυνόμενου γράφου
        }

    }

    public void hasEdge(Relation s, Relation d) {           //Εμφάνιση σχέσης μεταξύ των vertex

        if (map.get(s).contains(d)) {
           System.out.println("Υπάρχει σχέση μεταξύ του/της " + s + " και του/της " + d + "." );
        } else {
            System.out.println("Δεν υπάρχει σχέση μεταξύ του/της " + s + " και του/της " + d + ".");
        }
    }

    public static void readcsv() { new ReadCSV().readCSV(); }       //Κλήση μεθόδων από άλλες κλάσεις
    public void printGraph() {

        readcsv();                           //Κλήση μεθόδου readcsv που είναι αναγκαία για τη ταξηνόμηση
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


        System.out.print("Δώσε πρώτο όνομα: ");
        name1 = onoma1.nextLine();

        System.out.print("Δώσε δέυτερο όνομα: ");
        name2 = onoma2.nextLine();

         g.hasEdge(name1, name2);       //Κλήση μεθόδου για εμφάνιση σχέσης

    }

}

