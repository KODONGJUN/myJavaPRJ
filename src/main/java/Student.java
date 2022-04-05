public class Student {
    int studentID;
    String studentNAME;
    int grade;
    String address;

    public void showStudentInfor(){
        System.out.println(studentNAME + "," + address);
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentNAME = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfor();
    }
}
