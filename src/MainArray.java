import com.webapp.model.Resume;
import com.webapp.storage.ArrayStorage;
import com.webapp.storage.Storage;

public class MainArray {

    private final static Storage ARRAY_STORAGE = new ArrayStorage();//интерфейс, не реализация

    public static void main(String[] args) {

        Resume r1 = new Resume();
        r1.setUuid("uuid1");

        Resume r2 = new Resume();
        r2.setUuid("uuid2");

        Resume r3 = new Resume();
        r3.setUuid("uuid3");

        Resume r4 = new Resume();
        r4.setUuid("uuid4");

        Resume r5 = new Resume();
        r5.setUuid("uuid5");


        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r4);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.delete("uuid1");


        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);

        }

        System.out.println(ARRAY_STORAGE.size());
    }

}
