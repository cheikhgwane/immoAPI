package com.project.immo.service.dto;

import javax.persistence.Id;

/**
 * A DTO for the {@link com.project.immo.domain.Advertisement} entity.
 */
public class AdvertismentDTO {

    private Long id;

    private String title;

    private String description;

    private String pictureUrl;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
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
        return "AdvertisementDTO{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", pictureUrl='" + pictureUrl + '\'' +
            '}';
    }
}
