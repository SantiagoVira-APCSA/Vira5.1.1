public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    /* Write the two constructors here, as described above */
    public Student(String name, int grade, String school) {
        this.name = name;
        this.gradeLevel = grade;
        this.school = school;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.gradeLevel = grade;
        this.school = grade >= 9 && grade <= 12 ?
                "high school" : grade >= 6 && grade <= 8 ?
                "middle school" : "elementary school";
    }

    public String studentInfo() {
        /* implement me, as described above */
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
