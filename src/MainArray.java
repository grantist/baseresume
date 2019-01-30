import model.Resume;
import storage.ArrayStorage;

import java.util.HashSet;

public class MainArray {

    static ArrayStorage arrayStorage = new ArrayStorage();

    public static void main(String[] args) {

        HashSet set = new HashSet<>();

        set.add(1);

        Resume r1 = new Resume();
        Resume r2 = new Resume();
        Resume r3 = new Resume();

        r1.uuid = "uuid1";
        r2.uuid = "uuid2";
        r3.uuid = "uuid3";

        arrayStorage.save(r1);
        arrayStorage.save(r2);
        arrayStorage.save(r3);
        /*arrayStorage.delete(r1.uuid);*/


        for (Resume r : arrayStorage.getAll()) {
            System.out.println(r.getUuid());
        }

    }

}