package Lesson13.Ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String [] array = s.split("; ");

        switch (array[0]){

            case "Publication":
                Publication publication = new Publication(array[1]);
                System.out.println(publication.getInfo());
                break;
            case "Newspaper":
                Newspaper newspaper = new Newspaper(array[1], array[2]);
                System.out.println(newspaper.getInfo());
                break;
            case "Announcement":
                Announcement announcement = new Announcement(array[1],Integer.parseInt(array[2]));
                System.out.println(announcement.getInfo());
                break;
            case "Article":
                Article article = new Article(array[1], (array[2]));
                System.out.println(article.getInfo());
                break;
        }

    }

}
