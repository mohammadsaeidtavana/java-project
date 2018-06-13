package model.to;

import java.util.List;

/**
 * Created by user on 6/9/2017.
 */
public class person {
    private int age;
    private int id;
    private String name;
    private String fmily;
    private String comment;

    public person(int age, String name, String fmily, String comment) {
        this.age = age;
        this.name = name;
        this.fmily = fmily;
        this.comment = comment;

    }


    public book getBookLis() {
        return bookLis;
    }

    public void setBookLis(book bookLis) {
        this.bookLis = bookLis;
    }

    public book bookLis;
    public person() {

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFmily() {
        return fmily;
    }

    public void setFmily(String fmily) {
        this.fmily = fmily;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
