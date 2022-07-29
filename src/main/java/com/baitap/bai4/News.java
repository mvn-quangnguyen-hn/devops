package com.baitap.bai4;

import java.util.ArrayList;

public class News implements INews{
    //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    //
    //- declare class variables/attributes as private
    //- provide public get and set methods to access and update the value of a private variable
    private int id;
    private String title, publishDate, author, content;
    private static float averageRate;

    // Getter
    public int getId() {
        return id;
    }
    // Setter
    public void setId(int newId) {
        this.id = newId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String newPublishDate) {
        this.publishDate = newPublishDate;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String newContent) {
        this.content = newContent;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("Title; " + getTitle());
        System.out.println("Publish Date; " + getPublishDate());
        System.out.println("Author; " + getAuthor());
        System.out.println("Content; " + getContent());
        System.out.println("Average Rate; " + getAverageRate());
    }

    static int[] rateList = new int[3];

    public static float calculate(){
        int sum = 0;

        for (int i = 0; i < rateList.length; i++) {
            sum += rateList[i];
        }

        return averageRate = sum/rateList.length;
    }
}
