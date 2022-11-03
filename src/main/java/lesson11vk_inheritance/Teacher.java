package lesson11vk_inheritance;

public /*final*/ class Teacher extends Person {
    // final делает так, чтоб у базового класса не было чайлд класса, чтоб его нельзя было экстендать
    private String subject;

    public Teacher(String name, String lastName, int year, String subject) {
        super(name,lastName,year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
