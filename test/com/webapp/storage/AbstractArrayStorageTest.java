package com.webapp.storage;

import com.webapp.exception.NotExistStorageException;
import com.webapp.exception.StorageException;
import com.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public abstract class AbstractArrayStorageTest {

    private Storage storage;
    private final static String UUID1 = "uuid1";
    private final static String UUID2 = "uuid2";
    private final static String UUID3 = "uuid3";
    private final static String UUID4 = "uuid4";


    public AbstractArrayStorageTest(Storage storage) {
        this.storage = storage;
    }

    @Before

    public void setUp() {
        storage.clear();
        storage.save(new Resume(UUID1));
        storage.save(new Resume(UUID2));
        storage.save(new Resume(UUID3));

    }

    @Test
    public void size() {
        Assert.assertEquals(3, storage.size());
    }

    @Test
    public void clear() {
        storage.clear();
        Assert.assertEquals(0, storage.size());
    }

    @Test
    public void update() {
        Resume r4 = new Resume(UUID1);
        storage.update(r4);
        Assert.assertEquals(r4, storage.get(r4.getUuid()));
    }

    @Test
    public void getAll() {
        Resume[] resumes = new Resume[3];
        resumes[0] = new Resume(UUID1);
        resumes[1] = new Resume(UUID2);
        resumes[2] = new Resume(UUID3);
        Assert.assertArrayEquals(resumes, storage.getAll());

    }

    @Test
    public void save() {
        Resume r4 = new Resume(UUID4);
        storage.save(r4);
        Assert.assertEquals("uuid4", r4.getUuid());
    }

    @Test
    public void delete() {
        storage.delete(UUID1);
        Assert.assertEquals(2, storage.size());
    }

    @Test
    public void get() {
        Assert.assertEquals(new Resume(UUID1), storage.get(UUID1));

    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() {
        storage.get("dummy");
    }

    @Test (expected = StorageException.class)
    public void getOverflow() {
        storage.clear();
        Resume r = new Resume(UUID.randomUUID().toString());
        try {
            for (int i = 0; i <=storage.size()+1; i++) {
                storage.save(r);
            }
        } catch (StorageException e) {
            Assert.fail("Storage overflow");
        }
        storage.save(r);
    }
}

