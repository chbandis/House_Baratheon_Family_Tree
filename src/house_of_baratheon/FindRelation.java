package house_of_baratheon;

import java.util.Scanner;

public class FindRelation {

    public static void relmenu(){
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Find another relation");
            System.out.println("2. Exit");

            choice = input.nextInt();
            switch (choice) {                       //Create loop menu
                case 1:
                    relfinder();
                    break;
                case 2:
                    System.out.println("Closing");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter 1 or 2");
                    System.out.println("\n");
            }
         } while(choice != 2);
    }
     public static void relfinder() {               //Check relations between people

        String name1, name2;

                    Scanner onoma1 = new Scanner(System.in);
                    Scanner onoma2 = new Scanner(System.in);

                    System.out.print("Enter first name: ");
                    name1 = onoma1.nextLine();

                    System.out.print("Enter second name: ");
                    name2 = onoma2.nextLine();

                    if(name1.equals("Robert Baratheon") && name2.equals ("Cersei Lannister") || name1.equals("Cersei Lannister") && name2.equals ("Robert Baratheon")){
                        System.out.println("His/her relation " + name1 + " with him/her " + name2 + " is: Husband/Wife");
                    }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Selyse Baratheon") || name1.equals("Selyse Baratheon") && name2.equals ("Stannis Baratheon")){
                        System.out.println("His/her relation " + name1 + " with him/her " + name2 + " is: Husband/Wife");
                    }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Margaery Tyrell") || name1.equals("Margaery Tyrell") && name2.equals ("Renly Baratheon")){
                        System.out.println("His/her relation " + name1 + " with him/her " + name2 + " is: Husband/Wife");
                    }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Cassana Estermont") || name1.equals("Cassana Estermont") && name2.equals ("Steffon Baratheon")){
                        System.out.println("His/her relation " + name1 + " with him/her " + name2 + " is: Husband/ΐWife");
                    }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Gendry")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Father"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Father"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Robert Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Father"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Stannis Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Father"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Renly Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Father"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Joffrey Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Myrcella Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Cersei Lannister") && name2.equals ("Tommen Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Shireen Baratheon")){  System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Robert Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Stannis Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Renly Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Mother"); }
                    else if (name1.equals("Gendry") && name2.equals ("Robert Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Tommen Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Son"); }
                    else if (name1.equals("Myrcella Baratheon") && name2.equals ("Cersei Lannister")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Daughter"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Stannis Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Daughter"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Selyse Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Daughter"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Gendry")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Grandfather"); }
                    else if (name1.equals("Steffon Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Grandfather"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Gendry")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Grandmother"); }
                    else if (name1.equals("Cassana Estermont") && name2.equals ("Shireen Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Grandmother"); }
                    else if (name1.equals("Gendry") && name2.equals ("Steffon Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Grandson"); }
                    else if (name1.equals("Gendry") && name2.equals ("Cassana Estermont")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Grandson"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Steffon Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Granddaughter"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Cassana Estermont")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Granddaughter"); }
                    else if (name1.equals("Robert Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Uncle"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Uncle"); }
                    else if (name1.equals("Stannis Baratheon") && name2.equals ("Gendry")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Uncle"); }
                    else if (name1.equals("Renly Baratheon") && name2.equals ("Gendry")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Uncle"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Shireen Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Aunt"); }
                    else if (name1.equals("Margaery Tyrell") && name2.equals ("Shireen Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Aunt"); }
                    else if (name1.equals("Selyse Baratheon") && name2.equals ("Gendry")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Aunt"); }
                    else if (name1.equals("Margaery Tyrell") && name2.equals ("Gendry")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Aunt"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Robert Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Niece"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Renly Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Niece"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Selyse Baratheon")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Niece"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Margaery Tyrell")){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Niece"); }
                    else if (name1.equals("Gendry") && name2.equals ("Stannis Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Nephew"); }
                    else if (name1.equals("Gendry") && name2.equals ("Renly Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Nephew"); }
                    else if (name1.equals("Gendry") && name2.equals ("Selyse Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Nephew"); }
                    else if (name1.equals("Gendry") && name2.equals ("Margaery Tyrell")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Nephew"); }
                    else if (name1.equals("Gendry") && name2.equals ("Shireen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Cousin"); }
                    else if (name1.equals("Shireen Baratheon") && name2.equals ("Gendry")) { System.out.println("Her relation " + name1 + " with " + name2 + " is: Cousin"); }
                    else if (name1.equals("Myrcella Baratheon") && (name2.equals ("Joffrey Baratheon") || name2.equals ("Tommen Baratheon"))){ System.out.println("Her relation " + name1 + " with " + name2 + " is: Sister"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Myrcella Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Joffrey Baratheon") && name2.equals ("Tommen Baratheon")){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Tommen Baratheon") && (name2.equals ("Joffrey Baratheon"))){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Tommen Baratheon") && (name2.equals ("Myrcella Baratheon"))){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Robert Baratheon") && (name2.equals ("Stannis Baratheon") || name2.equals ("Renly Baratheon"))){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Stannis Baratheon") && (name2.equals ("Robert Baratheon") || name2.equals ("Renly Baratheon"))){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else if (name1.equals("Renly Baratheon") && (name2.equals ("Robert Baratheon") || name2.equals ("Stannis Baratheon"))){ System.out.println("His relation " + name1 + " with " + name2 + " is: Brother"); }
                    else { System.out.println("Invalid name(s)");
                    System.out.println("");}
                    System.out.println("\n");

                    relmenu();                  //Call the relmenu method
    }
}
