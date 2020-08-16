package Lesson14.classWork.Ex2;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("John Grant");
        System.out.println(user.getName());
        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);
        WebSite site = new WebSite();
        site.setUrl("https://tekwill.md");
        System.out.println(site.getGetUrl());
        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);
        Visit visit = new Visit();
        visit.setUser(user);
        visit.setWebSite(site);
        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);
        System.out.println(baseVisit.getId());
    }
}
