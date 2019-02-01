package com.webapp.storage;

import com.webapp.model.Resume;

public interface Storage {

    public void clear();

    public void save(Resume r);

    public void update(Resume r);

    public Resume get(String uuid);

    public Resume[] getAll();

    public void delete(String uuid);

    public int size();

}
