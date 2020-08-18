package Lesson14.classWork.Ex2;

public class Visit extends BaseEntity {

    protected User user;
    protected WebSite webSite;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }
}
