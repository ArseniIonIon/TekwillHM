package Lesson13.Ex2;

public class Announcement extends Publication {
    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        return "(days to expire - " + daysToExpire + "):";
    }

    @Override
    public String getType() {
        return  "Announcement";
    }
}
