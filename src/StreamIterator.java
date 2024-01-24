import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {
    List<Group> groupList;
    private int counter;
    public StreamIterator(List<Group> groupList) {
        this.groupList = groupList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter <= groupList.size();
    }

    @Override
    public Group next() {
        if (hasNext()) return groupList.get(counter);
        return null;
    }
}
