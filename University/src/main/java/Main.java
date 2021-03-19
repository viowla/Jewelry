import entity.Faculty;
import entity.Group;
import entity.Student;
import entity.Subject;
import service.UniversityService;

import java.util.List;

import static entity.Grade.*;

public class Main {
    public static void main(String[] args) {

        Subject math = new Subject("Math");
        Subject physics = new Subject("Physics");
        Subject chemistry = new Subject("Chemistry");
        Subject art = new Subject("Art");
        Subject foreign = new Subject("Foreign language");

        Student amelie = new Student("Amelie Smith", List.of(THREE, FOUR, FOUR),List.of(chemistry,math,art));
        Student john = new Student("John Doe", List.of(ONE, FOUR, FIVE),List.of(physics,math,foreign));
        Student sam = new Student("Sam Smith", List.of(THREE, TWO, TWO),List.of(art,chemistry,foreign));

        Group group1 = new Group("Group-1", List.of(amelie,sam));
        Group group2 = new Group("Group-2", List.of(john,sam));
        Group group3 = new Group("Group-3", List.of(amelie,john));

        Faculty faculty1 = new Faculty("Faculty-1", List.of(group1, group2));
        Faculty faculty2 = new Faculty("Faculty-2", List.of(group1, group3));
        Faculty faculty3 = new Faculty("Faculty-3", List.of(group3, group2));

        UniversityService universityService = new UniversityService();
        universityService.getAverageMark(amelie);
        universityService.getAverageMarkCertainSubject(faculty1, group1, art);
    }
}
