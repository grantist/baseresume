package com.webapp;

import com.webapp.exception.NotExistStorageException;
import com.webapp.model.Resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCollections {
    static List<Resume> collection = new ArrayList<>();

    private final static String UUID_1 = "uuid1";
    private final static Resume RESUME_1 = new Resume(UUID_1);

    private final static String UUID_2 = "uuid2";
    private final static Resume RESUME_2 = new Resume(UUID_2);

    private final static String UUID_3 = "uuid3";
    private final static Resume RESUME_3 = new Resume(UUID_3);

    private final static String UUID_4 = "uuid4";
    private final static Resume RESUME_4 = new Resume(UUID_4);

    public static void update(Resume resume) {
        if (!collection.contains(resume)) {
            throw new NotExistStorageException(resume.getUuid());
        }
        resume = collection.get(collection.size() - 1);
    }


    public static void main(String[] args) {
        collection.add(RESUME_1);
        collection.add(RESUME_2);
        collection.add(RESUME_3);

        for (Resume r : collection) {
            System.out.println(r.toString());
        }


        /*for (Resume r : collection) {
            System.out.println(r);
            if (Objects.equals(r.getUuid(), UUID_1)) {
                // collection.remove(r);
            }
        }*/

       /* Iterator<Resume> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Resume r = iterator.next();
            System.out.println(r);
            if (Objects.equals(r.getUuid(), UUID_1)) {
                iterator.remove();
            }
        }*/
        System.out.println(collection.toString());

        Map<String, Resume> map = new HashMap<>();
        map.put(UUID_1, RESUME_1);
        map.put(UUID_2, RESUME_2);
        map.put(UUID_3, RESUME_3);


        for (String uuid : map.keySet()) {
            System.out.println(map.get(uuid));
        }


        for (Map.Entry<String, Resume> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }


}
