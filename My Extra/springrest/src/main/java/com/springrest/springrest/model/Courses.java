package com.springrest.springrest.model;

public class Courses {
    private long id;
    private String title;
    private String desc;

    public Courses(long id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.desc = desc;
    }

    public Courses() {
        super();
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
