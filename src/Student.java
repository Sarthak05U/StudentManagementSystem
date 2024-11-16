public class Student extends Person implements ScholarshipEligibility{
    private int studentId;
    private Integer []grades = new Integer[5];
    private static int totalNoOfStudents=0;
    private Course courseDetails;

    public Student(int age, String name, int studentId, Integer[] grades,int courseId,String courseName) {
        super(age, name);
        this.studentId = studentId;
        this.grades = grades;
        courseDetails = new Course(courseId,courseName);
        totalNoOfStudents++;
    }

    @Override
    public void getDetails() {
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Student Id: "+studentId);
        System.out.println("Student name: "+getName());
        System.out.println("Student age: "+getAge());
        System.out.println("Grades: ");
        for(int grade : grades){
            System.out.print(grade+"\t");
        }
    }

    public int getAverage(){
        int sum=0;
        for(int grade: grades){
            sum+=grade;
        }
        System.out.println("Average is: "+(sum/ grades.length));
        return sum/ grades.length;
    }

    @Override
    public boolean isEligibleForScholarship() {
        if(getAverage() >= 85){
            return true;
        }
        return false;
    }

    public static int getTotalStudents(){
        return totalNoOfStudents;
    }

    private class Course{
        private int courseId;
        private String courseName;

        public Course(int courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }
    }
}
