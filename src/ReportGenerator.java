public class ReportGenerator implements Runnable{
    Student student;

    public ReportGenerator(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        student.getDetails();
        student.getAverage();
    }
}
