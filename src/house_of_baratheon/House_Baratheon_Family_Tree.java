package house_of_baratheon;


import java.util.Scanner;

public class House_Baratheon_Family_Tree {

        public static void PrintCSV(){ new PrintCSV().printCSV(); }      //Call methods from other classes
        //public static void PrintGraph() { new Graph().printGraph(); }  //Call the printGraph method of the Graph.java class that was not used
        public static void SortCSV() { new SortCSV().SortByName(); }
        public static void WriteToFile() throws Exception { new WriteToFile().write();}
        public static void FindRelation() { new FindRelation().relfinder();}

        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);

            int choice;
            do {
                System.out.println("Main Application Menu");
                System.out.println("1. View CSV file");
                System.out.println("2. Sort people by lexicographical order and export txt file");
                System.out.println("3. Find relation");
                System.out.println("4. Export a .dot file and visualize it in a .jpg file");
                System.out.println("5. Exit");
                System.out.print("Select: ");

                choice = input.nextInt();             //User input

                                //Create a central menu and call the appropriate method according to the selection
                switch (choice) {
                    case 1:
                        PrintCSV();
                        System.out.println("\n");
                        break;
                    case 2:
                        SortCSV();
                        System.out.println("\n");
                        System.out.println("The SortedCSV_Names&Genders file was successfully exported!");
                        System.out.println("\n");
                        break;
                    case 3:
                        FindRelation();
                        //PrintGraph();         //Unused printGraph method
                        break;
                    case 4:
                        WriteToFile();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        System.out.println("Closing");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter from 1 to 5");
                        System.out.println("\n");
                }
            } while(choice !=5);
        }
    }
