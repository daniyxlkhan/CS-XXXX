public abstract class Student implements Gradable {
    private static int ID = 1000;
    private final int STUDENT_ID;
    private String name;
    private CourseMatrix courseMatrix;

    public Student(String name, CourseMatrix courseMatrix) {
        STUDENT_ID = ID;
        ID++;
        this.name = name;
        this.courseMatrix = courseMatrix;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return STUDENT_ID;
    }

    public CourseMatrix getCourseMatrix() {
        return courseMatrix;
    }

    public String listCourses() {
    CourseMatrix courseMatrix = getCourseMatrix();
    String[][] courseCode = courseMatrix.getCourseCodes();
    double[][] gpa = courseMatrix.getGPA();
    String courseList = "";

    for (int term = 0; term < courseCode.length; term++) {
        courseList += "Term: " + (term+1) + "\n";
        for (int course = 0; course < courseCode[term].length; course++) {
            courseList += gpa[term][course] + " " + courseCode[term][course] + "\n";
        }
    }
    return courseList;
    }
}