public class main {

    public static void main(String[] args) {

        student student = new student();

        student.setStudentID("202505010469");
        student.setName("Hala Hasabo Hasan Talha");
        student.setCGPA(3.5);
        student.setProgramme("BCSSE");

        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme  : " + student.getProgramme());
    }
}