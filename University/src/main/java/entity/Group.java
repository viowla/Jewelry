package entity;

import java.util.List;

public class Group {
    private String groupName;
    private List<Student> studentList;

    public Group(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = studentList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
