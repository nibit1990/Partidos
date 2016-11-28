package com.example.usuario.partidos;

/**
 * Created by Usuario on 28/11/2016.
 */

public class Category {

    private String title;
    private String categoryId;
    private String description;
    private String description2;

    public Category() {
        super();
    }

    public Category(String categoryId, String title, String description, String description2) {
        super();
        this.title = title;
        this.description = description;
        this.description2 = description2;
        this.categoryId = categoryId;
    }


    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return description2;
    }

    public String getDescription2() {
        return description2;
    }
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getCategoryId(){return categoryId;}

    public void setCategoryId(String categoryId){this.categoryId = categoryId;}

}