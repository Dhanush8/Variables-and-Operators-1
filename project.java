package abc;

import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName=sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName=sc.nextLine();

        String fullName=firstName+" "+lastName;

        System.out.print("Your full name is: "+fullName);
}

}
