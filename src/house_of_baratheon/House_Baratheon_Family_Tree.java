
package house_of_baratheon;


import java.util.Scanner;

public class House_Baratheon_Family_Tree {

        public static void PrintCSV(){ new PrintCSV().printCSV(); }      //Κλήση μεθόδων από άλλες κλάσεις
        //public static void PrintGraph() { new Graph().printGraph(); }  //Χρήση μεθόδου printGraph της κλάσης Graph.java που δε χρησιμοποιήθηκε
        public static void SortCSV() { new SortCSV().SortByName(); }
        public static void WriteToFile() throws Exception { new WriteToFile().write();}
        public static void FindRelation() { new FindRelation().relfinder();}

        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);

            int choice;
            do {
                System.out.println("Κεντρικό Μενού Εφαρμογής");
                System.out.println("1. Εμφάνιση CSV αρχείου");
                System.out.println("2. Ταξινόμηση των ανθρώπων κατά λεξικογραφική σειρά και εξαγωγή αρχείου txt");
                System.out.println("3. Εύρεση Σχέσεων");
                System.out.println("4. Εξαγωγή αρχείου .dot και οπτικοποίηση του σε αρχείο .jpg");
                System.out.println("5. Έξοδος");
                System.out.print("Επιλογή: ");

                choice = input.nextInt();             //Εισαγωγή από το χρήστη

                                //Δημιουργία κεντρικού μενού και κλήση της κατάλληλης μεθόδου σύμφωνα με την επιλογή
                switch (choice) {
                    case 1:
                        PrintCSV();
                        System.out.println("\n");
                        break;
                    case 2:
                        SortCSV();
                        System.out.println("\n");
                        System.out.println("Το αρχείο SortedCSV_Names&Genders εξήχθει επιτυχώς!");
                        System.out.println("\n");
                        break;
                    case 3:
                        FindRelation();
                        //PrintGraph();         //Μέθοδος printGraph που δε χρησιμοποιήθηκε
                        break;
                    case 4:
                        WriteToFile();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        System.out.println("Πραγματοποιείται έξοδος");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Εισάγετε από 1 εώς 5");
                        System.out.println("\n");
                }
            } while(choice !=5);
        }
    }

