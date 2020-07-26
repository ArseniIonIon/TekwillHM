package Lesson11;

import java.util.Scanner;

public class Ex9 {


    public static String prepareFullName(String firstName, String lastName){
        String fullName;

        if(lastName == null) {
            fullName = firstName;
        }else {
            fullName = firstName.concat(" ").concat(lastName);

        }
        return fullName;
    }


    public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
          //  firstName = "null".equals(firstName) ? null : firstName;
            String lastName = scanner.nextLine();
           // lastName = "null".equals(lastName) ? null : lastName;
            System.out.println(prepareFullName(firstName, lastName));
        }
    }

