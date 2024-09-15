public class UndergradStudent extends Student {
    private String degreeProgram;

    public UndergradStudent(String name, CourseMatrix courseMatrix, String degreeProgram) {
        super(name, courseMatrix);
        this.degreeProgram = degreeProgram;
    }

    public double calculateGPA() {
       String[][] courseCodes = this.getCourseMatrix().getCourseCodes();
       double[][] gpas = this.getCourseMatrix().getGPA();
       int totalCredits = 0;
       double totalGradePoints = 0.0;
       
        for (int term = 0; term < courseCodes.length; term++) {
            for (int course = 0; course < courseCodes[term].length; course++) {
                String courseCode = courseCodes[term][course];
                double gpa = gpas[term][course];

                if (!courseCode.equals("") && gpa != -1) {
                    if(courseCode.startsWith(degreeProgram)) {
                        totalCredits += 4;
                        totalGradePoints += (4*gpa);
                    } else {
                        totalCredits += 3;
                        totalGradePoints += (3*gpa);
                    }
                }
            }     
        }
        if (totalCredits == 0) {
            return 0;
        }
        return totalGradePoints/totalCredits;
    }   

    public String toString() {
        return "Name: " + this.getName() + "\n" + "Degree: " + this.degreeProgram + "\n" + "Overall GPA: " + Math.round(this.calculateGPA()*100.0)/100.0 + "\n";
    }
}