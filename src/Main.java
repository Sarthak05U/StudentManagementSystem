public class Main {
    public static void main(String[] args) {
        Student []students = new Student[5];
        ReportGenerator reportGenerator;

        students[0] = new Student(10,"ABC",101,
                new Integer[]{10,20,30,58,64},10001,"Java");
        students[1] = new Student(11,"XYZ",111,
                new Integer[]{15,40,20,38,54},10002,"WEB");
        students[2] = new Student(9,"PQR",201,
                new Integer[]{65,25,30,58,46},10003,"Angular");

        for(int i=0;students[i]!=null;i++){
            students[i].getDetails();
            System.out.println("eligibility for scholarship: "+students[i].isEligibleForScholarship());
            reportGenerator= new ReportGenerator(students[i]);
            Thread t1=new Thread(reportGenerator);
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            t1.start();
        }



    }
}