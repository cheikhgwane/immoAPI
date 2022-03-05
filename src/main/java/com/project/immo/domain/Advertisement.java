package com.project.immo.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "advertisment")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="title",nullable = false)
    private String title;

    private String description;

    @Column(name="pictureUrl",nullable = false)
    private String pictureUrl;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }


    @Override
    public String toString() {
        return "Advertisement{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", pictureUrl='" + pictureUrl + '\'' +
            '}';
    }
}

