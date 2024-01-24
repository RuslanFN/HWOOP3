import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group>, Comparable<Stream>{
    private List<Group> groupList;



    private int countGroups;
    public int getCountGroups() {
        return countGroups;
    }
    public Stream(List<Group> groupList) {
        this.groupList = groupList;
        countGroups = groupList.size();
    }

    @Override
    public Iterator iterator() {
        return new StreamIterator(groupList);
    }

    @Override
    public int compareTo(Stream o) {
        if (o.getCountGroups() > countGroups) return -1;
        else if (o.getCountGroups() < countGroups) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "groupList=" + groupList +
                ", countGroups=" + countGroups +
                '}';
    }
}
