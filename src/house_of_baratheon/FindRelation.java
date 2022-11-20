package house_of_baratheon;

import java.util.Scanner;

public class FindRelation {

    public static void relmenu(){
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Εύρεση άλλης σχέσης");
            System.out.println("2. Έξοδος");

            choice = input.nextInt();
            switch (choice) {                       //Δημιουργία loop menu
                case 1:
                    relfinder();
                    break;
                case 2:
                    System.out.println("Πραγματοποιείται έξοδος");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Εισάγετε 1 ή 2");
                    System.out.println("\n");
            }
         } while(choice != 2);
    }
     public static void relfinder() {               //Έλεγχος σχέσεων μεταξύ ατόμων

        String name1, name2;

                    Scanner onoma1 = new Scanner(System.in);
                    Scanner onoma2 = new Scanner(System.in);

                    System.out.print("Εισάγετε πρώτο όνομα: ");
                    name1 = onoma1.nextLine();

                    System.out.print("Εισάγετε δέυτερο όνομα: ");
                    name2 = onoma2.nextLine();

                    if(name1.equals("Robert Baratheon") && name2.equals ("Cersei Lannister") || name1.equals("Cersei Lannister") && name2.equals ("Robert Baratheon")){
                        System.out.println("Η σχέση του/της " + name1 + " με τον/την " + name2 + " είναι: Σύζυγος");
                    }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Selyse Baratheon") || name1.equals("Selyse Baratheon") && name2.equals ("Stannis Baratheon")){
                        System.out.println("Η σχέση του/της " + name1 + " με τον/την " + name2 + " είναι: Σύζυγος");
                    }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Margaery Tyrell") || name1.equals("Margaery Tyrell") && name2.equals ("Renly Baratheon")){
                        System.out.println("Η σχέση του/της " + name1 + " με τον/την " + name2 + " είναι: Σύζυγος");
                    }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Cassana Estermont") || name1.equals("Cassana Estermont") && name2.equals ("Steffon Baratheon")){
                        System.out.println("Η σχέση του/της " + name1 + " με τον/την " + name2 + " είναι: Σύζυγος");
                    }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Gendry")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Πατέρας"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Πατέρας"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Robert Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Πατέρας"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Stannis Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Πατέρας"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Renly Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Πατέρας"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Joffrey Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Myrcella Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Tommen Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Shireen Baratheon")){  System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Robert Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Stannis Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Renly Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Μητέρα"); }
                    else if (name1.equals("Gendry") && name2.equals ("Robert Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Tommen Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Γιος"); }
                    else if (name1.equals("Myrcella Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Κόρη"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Stannis Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Κόρη"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Selyse Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Κόρη"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Gendry")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Παππούς"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Παππούς"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Gendry")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Γιαγιά"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Γιαγιά"); }
                    else if (name1.equals("Gendry") && name2.equals ("Steffon Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Εγγονός"); }
                    else if (name1.equals("Gendry") && name2.equals ("Cassana Estermont")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Εγγονός"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Εγγονή"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Εγγονή"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Θείος"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Θείος"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Gendry")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Θείος"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Gendry")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Θείος"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Θεία"); }
                    else if (name1.equals("Margaery Tyrell") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Θεία"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Gendry")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Θεία"); }
                    else if (name1.equals("Margaery Tyrell") && name2.equals ("Gendry")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Θεία"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Robert Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Ανιψιά"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Renly Baratheon")){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Ανιψιά"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Selyse Baratheon")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Ανιψιά"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Margaery Tyrell")){ System.out.println("Η σχέση της " + name1 + " με την " + name2 + " είναι: Ανιψιά"); }
                    else if (name1.equals("Gendry") && name2.equals ("Stannis Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Ανιψιός"); }
                    else if (name1.equals("Gendry") && name2.equals ("Renly Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Ανιψιός"); }
                    else if (name1.equals("Gendry") && name2.equals ("Selyse Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Ανιψιός"); }
                    else if (name1.equals("Gendry") && name2.equals ("Margaery Tyrell")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Ανιψιός"); }
                    else if (name1.equals("Gendry") && name2.equals ("Shireen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Ξάδερφος"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Gendry")) { System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Ξαδέρφη"); }
                    else if (name1.equals("Myrcella Baratheon") && (name2.equals ("Joffrey Baratheon") || name2.equals ("Tommen Baratheon"))){ System.out.println("Η σχέση της " + name1 + " με τον " + name2 + " είναι: Αδερφή"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Myrcella Baratheon")){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Tommen Baratheon")){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Tommen Baratheon") && (name2.equals ("Joffrey Baratheon"))){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Tommen Baratheon") && (name2.equals ("Myrcella Baratheon"))){ System.out.println("Η σχέση του " + name1 + " με την " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Robert Baratheon") && (name2.equals ("Stannis Baratheon") || name2.equals ("Renly Baratheon"))){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Stannis Baratheon") && (name2.equals ("Robert Baratheon") || name2.equals ("Renly Baratheon"))){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Αδερφός"); }
                    else if (name1.equals("Renly Baratheon") && (name2.equals ("Robert Baratheon") || name2.equals ("Stannis Baratheon"))){ System.out.println("Η σχέση του " + name1 + " με τον " + name2 + " είναι: Αδερφός"); }
                    else { System.out.println("Μη έγκυρο/α όνομα/ονόματα");
                    System.out.println("");}
                    System.out.println("\n");

                    relmenu();                  //Κλήση μεθόδου relmenu

    }
}

