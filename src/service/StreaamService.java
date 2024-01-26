import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreaamService {
    private List<Stream> streamList;

    public StreaamService(List<Stream> streamList) {
        this.streamList = streamList;
    }
    public List<Stream> getSortedStream(){
        List<Stream> streams = new ArrayList<>(streamList);
        Collections.sort(streams);
        return streams;
    }
}
