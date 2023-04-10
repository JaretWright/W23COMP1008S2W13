package com.example.w23comp1008s2w13;

public class Grade {
    private int crn;
    private String courseCode, courseName;
    private int grade;

    public Grade(int crn, String courseCode, String courseName, int grade) {
        setCrn(crn);
        setCourseCode(courseCode);
        setCourseName(courseName);
        setGrade(grade);
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        if (crn >= 20000 && crn < 30000)
            this.crn = crn;
        else
            throw new IllegalArgumentException("crn must be in the range of 20000-29999");
    }

    public String getCourseCode() {
        return courseCode;
    }

    //What is the pattern for a valid input?
    public void setCourseCode(String courseCode) {
        courseCode = courseCode.replaceAll(" ","");
        courseCode = courseCode.toUpperCase();
        if (courseCode.matches("[A-Z]{4}[0-9]{4}"))
            this.courseCode = courseCode;
        else
            throw new IllegalArgumentException("Course code must be 4 characters followed by 4 num");
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getGrade() {
        return grade;
    }

    //What is a valid grade?
    //A B C D E F, 0-100, >=0
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
        else
            throw new IllegalArgumentException("grade must be in the range 0-100");
    }
}
