package com.webapp;

import com.webapp.model.Resume;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws Exception {
        Resume resume = new Resume();
        Field field = resume.getClass().getDeclaredFields()[0];
        field.setAccessible(true);
        field.set(resume, "newuuid");
        storage.save(r);
        //TODO:  invoke r.toString via reflection
        Method method = resume.getClass().getMethod("toString");
        Object result = method.invoke(resume);
        System.out.println(result);

    }
}
