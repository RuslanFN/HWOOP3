import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupSetvice {
    private Group group;

    public GroupSetvice(Group group) {
        this.group = group;
    }
    public List <Student> getSortedGroup(){
        List<Student> studentList = new ArrayList<>(group.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public List <Student> getSortedGroupByName(){
        List<Student> studentList = new ArrayList<>(group.getStudentList());
        Collections.sort(studentList, new UserComparator());
        return studentList;
    }

}
