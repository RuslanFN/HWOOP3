import java.util.List;

public interface UserView <T extends User> {
    public void setOnConsole(List<T> list);

}
