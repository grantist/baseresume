import com.webapp.model.Resume;
import com.webapp.storage.SortedArrayStorage;
import com.webapp.storage.Storage;

public class MainArray {

    private final static Storage ARRAY_STORAGE = new SortedArrayStorage();//интерфейс, не реализация

    public static void main(String[] args) {

        Resume r1 = new Resume("uuid1");
        Resume r2 = new Resume("uuid2");
        Resume r3 = new Resume("uuid3");
        Resume r4 = new Resume("uuid4");
        Resume r5 = new Resume("uuid5");


        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);
        ARRAY_STORAGE.delete("uuid1");
        System.out.println(ARRAY_STORAGE.size());


/*
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);

        }

        System.out.println(ARRAY_STORAGE.size());
    }*/

    }

}








