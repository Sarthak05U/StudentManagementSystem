public class GraduateStudent extends Student{
    private int passingYear;
    private float passingPercentage;
    private String degreeTitle;


    public GraduateStudent(int age, String name, int studentId, Integer[] grades, int courseId, String courseName, int passingYear, float passingPercentage, String courseTitle) {
        super(age, name, studentId, grades, courseId, courseName);
        this.passingYear = passingYear;
        this.passingPercentage = passingPercentage;
        degreeTitle = courseTitle;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Degree name: "+degreeTitle);
        System.out.println("passing year: "+passingYear);
        System.out.println("passing percentage: "+passingPercentage);
    }
}
