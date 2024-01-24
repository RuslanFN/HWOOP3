import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Руслан", "Фаткулин", "Нургалиевич");
        Student student2 = new Student(2, "Денис","Панов", "Дмитриевич");
        Student student3 = new Student(3, "Ильдус","Шайгарданов", "Ильдарович");
        Student student4 = new Student(4, "Алексей","Потапков", "Алексеевич");
        List<Student> studentList = new ArrayList<>();
        Group group = new Group(studentList);
        Group group2 = new Group(studentList);
        Group group3 = new Group(studentList);
        Group group4 = new Group(studentList);
        Group group5 = new Group(studentList);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        List<Group> groupList = new ArrayList<>();
        List<Group> groupList2 = new ArrayList<>();
        groupList.add(group);
        groupList.add(group2);
        groupList.add(group3);
        groupList2.add(group4);
        groupList2.add(group5);
        Stream stream = new Stream(groupList);

        Stream stream2 = new Stream(groupList2);
        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream);
        streamList.add(stream2);
        StreaamService streaamService = new StreaamService(streamList);

        GroupSetvice groupSetvice = new GroupSetvice(group);
        for (Stream stream1: streaamService.getSortedStream()){
            System.out.println(stream1);
        }
        System.out.println();


    }
}