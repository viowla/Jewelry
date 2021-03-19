package entity;

import java.util.List;

public class Student {
    private String fullname;
    private List<Grade> grades;
    private List<Subject> subject;

    public Student(String fullname, List<Grade> grades, List<Subject> subject) {
        this.fullname = fullname;
        this.grades = grades;
        this.subject = subject;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
}
