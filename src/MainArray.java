import com.webapp.model.Resume;
import com.webapp.storage.ArrayStorage;

public class MainArray {

    static ArrayStorage arrayStorage = new ArrayStorage();

    public static void main(String[] args) {

        Resume r1 = new Resume();
        r1.setUuid("uuid1");

        Resume r2 = new Resume();
        r2.setUuid("uuid2");

        Resume r3 = new Resume();
        r3.setUuid("uuid3");

        arrayStorage.save(r1);
        arrayStorage.save(r2);
        arrayStorage.save(r3);

        for (Resume r : arrayStorage.getAll()) {
            System.out.println(r);

        }
    }

}
