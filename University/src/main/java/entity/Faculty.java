package entity;

import java.util.List;

public class Faculty {

    private String facultyName;
    private List<Group> groups;

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
