import java.util.Iterator;

public class Student extends User implements Comparable<Student>{
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return studentId + super.getFirstName() + " " + super.getSecondName() + " " + super.getLastName()  ;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student o) {
        if (o.studentId > studentId) return -1;
        else if (o.studentId < studentId) return 1;
        else return 0;
    }
}
