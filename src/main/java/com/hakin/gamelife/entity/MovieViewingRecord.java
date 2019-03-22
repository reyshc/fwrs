package com.hakin.gamelife.entity;

import java.util.Date;

public class MovieViewingRecord {
    private Integer id;

    private String name;

    private String description;

    private String image;

    private String mark;

    private String actor;

    private String path;

    private Date viewingTime;

    private String movieType;

    public MovieViewingRecord(Integer id, String name, String description, String image, String mark, String actor, String path, Date viewingTime, String movieType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.mark = mark;
        this.actor = actor;
        this.path = path;
        this.viewingTime = viewingTime;
        this.movieType = movieType;
    }

    public MovieViewingRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getViewingTime() {
        return viewingTime;
    }

    public void setViewingTime(Date viewingTime) {
        this.viewingTime = viewingTime;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType == null ? null : movieType.trim();
    }
}