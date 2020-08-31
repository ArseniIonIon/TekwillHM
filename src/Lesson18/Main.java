package Lesson18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String[] s = sc.nextLine().split("\\s+");
             //   int i = Integer.parseInt(sc.next());
                try{
                    int i  = Integer.parseInt(sc.nextLine());
                    System.out.println(s[i]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("No such element");
                }

            }
    }
