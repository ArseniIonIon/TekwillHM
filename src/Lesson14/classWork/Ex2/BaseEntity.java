package Lesson14.classWork.Ex2;

public abstract class BaseEntity {
    protected long id;
    protected  long version;

    public long getId() {
        return id;
    }

    public long getVersion() {
        return version;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
