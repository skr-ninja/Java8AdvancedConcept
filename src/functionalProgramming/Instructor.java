package functionalProgramming;

import java.util.List;

public class Instructor {
    String name;
    int yearsOfExperience;
    String title;
    String gender;
    boolean onlineCourse;
    List<String> course;

    public Instructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourse, List<String> asList) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
        this.gender = gender;
        this.onlineCourse = onlineCourse;
        this.course = asList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(boolean onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", onlineCourse=" + onlineCourse +
                ", course=" + course +
                '}';
    }
}
