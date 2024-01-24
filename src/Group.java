import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student>{
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Group(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }
}
