package Lesson11.HomeWork;

import java.awt.font.TextHitInfo;

public enum Ex3 {
    USD("United States dollar"), EUR("Euro"), GBP("Pound sterling"),
    RUB("Russian ruble"), UAH("Ukrainian hryvnia"), KZT("Kazakhstani tenge");

    String description;
    Ex3(String description){
        this.description = description;
    }

}
