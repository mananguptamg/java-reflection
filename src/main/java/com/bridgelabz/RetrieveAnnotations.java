package com.bridgelabz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name();
}

@Author(name="James Gosling")
class Document {
}

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Document document = new Document();
        Class<?> cls = document.getClass();

        Author author = cls.getAnnotation(Author.class);
        System.out.println("Value of annotation is: " +author.name());
    }
}
