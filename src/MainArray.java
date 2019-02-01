import com.webapp.model.Resume;
import com.webapp.storage.ArrayStorage;

public class MainArray {

    static ArrayStorage arrayStorage = new ArrayStorage();

    public static void main(String[] args) {

        Resume r1 = new Resume();
        r1.setUuid("uuid1");

        Resume r2 = new Resume();
        r1.setUuid("uuid2");

        Resume r3 = new Resume();
        r1.setUuid("uuid3");


    }

}
