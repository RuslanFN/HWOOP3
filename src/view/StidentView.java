import java.util.List;

public class StidentView implements UserView<Student>{
    @Override
    public void setOnConsole(List<Student> list) {
        for (Student student:list){
            System.out.println(student);
        }
    }
}
