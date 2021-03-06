package com.testdroid.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testdroid.api.APIEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author Łukasz Kajda <lukasz.kajda@bitbar.com>
 */
@XmlRootElement
public class APIProperty extends APIEntity {

    private String description;

    private Date fromTime;

    private String name;

    private Date toTime;

    private Date updateTime;

    private String updatedByDisplayName;

    private Long updatedById;

    private String value;

    public APIProperty() {
    }

    public APIProperty(
            Long id, String name, String value, String description, Long updatedById, String updatedByDisplayName,
            Date updateTime, Date fromTime, Date toTime) {
        super(id);
        this.name = name;
        this.value = value;
        this.description = description;
        this.updatedById = updatedById;
        this.updatedByDisplayName = updatedByDisplayName;
        this.updateTime = updateTime;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Long updatedById) {
        this.updatedById = updatedById;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public String getUpdatedByDisplayName() {
        return updatedByDisplayName;
    }

    public void setUpdatedByDisplayName(String updatedByDisplayName) {
        this.updatedByDisplayName = updatedByDisplayName;
    }

    @Override
    @JsonIgnore
    protected <T extends APIEntity> void clone(T from) {
        APIProperty apiProperty = (APIProperty) from;
        cloneBase(from);
        this.description = apiProperty.description;
        this.fromTime = apiProperty.fromTime;
        this.name = apiProperty.name;
        this.toTime = apiProperty.toTime;
        this.updateTime = apiProperty.updateTime;
        this.updatedByDisplayName = apiProperty.updatedByDisplayName;
        this.updatedById = apiProperty.updatedById;
        this.value = apiProperty.value;
    }
}
