package com.codefinity;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomNumberInjector {
    public static void injectRandomNumbers(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        Random random = new Random();

        for (Field field : fields) {
            if (field.isAnnotationPresent(RandomNumber.class)) {
                RandomNumber annotation = field.getAnnotation(RandomNumber.class);
                int min = annotation.min();
                int max = annotation.max();
                int randomValue = random.nextInt(max - min + 1) + min;

                field.setAccessible(true);
                field.set(obj, randomValue);
            }
        }
    }
}
