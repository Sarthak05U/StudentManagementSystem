public class PostGraduateStudent extends Student{
    private int pgPassingYear;
    private float pgPassingPercentage;
    private String pgDegreeTitle;
    private String ugDegreeTitle;
    private int ugPassingYear;
    private float ugPassingPercentage;

    public PostGraduateStudent(int age, String name, int studentId, Integer[] grades, int courseId, String courseName, int passingYear, float pgPassingPercentage, String pgDegreeTitle, String ugDegreeTitle, int ugPassingYear, float ugPassingPercentage) {
        super(age, name, studentId, grades, courseId, courseName);
        this.pgPassingYear = passingYear;
        this.pgPassingPercentage = pgPassingPercentage;
        pgDegreeTitle = pgDegreeTitle;
        ugDegreeTitle = ugDegreeTitle;
        ugPassingYear = ugPassingYear;
        this.ugPassingPercentage = ugPassingPercentage;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Undergraudate Degree name: "+ugDegreeTitle);
        System.out.println("Undergraudate passing year: "+ugPassingYear);
        System.out.println("Undergraudate passing percentage: "+ugPassingPercentage);
        System.out.println("Postgraduate Degree name: "+pgDegreeTitle);
        System.out.println("Postgraduate passing year: "+pgPassingYear);
        System.out.println("Postgraduate passing percentage: "+pgPassingPercentage);

    }
}
