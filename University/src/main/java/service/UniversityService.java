package service;

import entity.*;

import java.io.IOException;
import java.util.List;

public class UniversityService {

    List<Faculty> faculties;
    List<Subject> subjects;
    List<Group> groups;

    public double getAverageMark(Student student){
        double avg;
        double total=0;
        for (Grade grade : student.getGrades()){
            total=total+grade.getValue();
        }
        avg=total/student.getGrades().size();
        return avg;
    }

    public double getAverageMarkCertainSubject(Faculty faculty, Group group, Subject subject){

        try{
            if (!faculties.contains(faculty)||!groups.contains(group)||!subjects.contains(subject)){
                getAverageMark(group.getStudentList().get(0));
            }
        }
        catch (IOException e){
            System.out.println("No such faculty/group/subject.");
        }
    }

}
