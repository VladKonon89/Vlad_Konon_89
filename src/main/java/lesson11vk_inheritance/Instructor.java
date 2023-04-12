package lesson11vk_inheritance;

public class Instructor extends Human {
    private String name;
    private String lastname;
    private int year;
    private String subject;

    public Instructor(String name, String lastname, int year, String subject) {
      super(name,lastname,year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
