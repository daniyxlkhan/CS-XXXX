public class CourseMatrix {
    private String[][] courseCodes;
    private double[][] gpa;

    public CourseMatrix(String[][] courseCodes, double[][] gpa){ 
        this.courseCodes = courseCodes;
        this.gpa = gpa;
    }

    public String[][] getCourseCodes() {
        return courseCodes;
    }

    public double[][] getGPA() {
        return gpa;
    }
}