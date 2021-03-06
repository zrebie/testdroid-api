package com.testdroid.api.model.notification;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.testdroid.api.APIEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author Damian Sniezek <damian.sniezek@bitbar.com>
 */
@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APINotificationPlan extends APIEntity {

    private String name;

    private Long handlerId;

    private String handlerEmail;

    private String contentTemplate;

    private String subjectTemplate;

    private Date createTime;

    private Date updateTime;

    private Date sentTime;

    private APINotificationChannel notificationChannel;

    private APINotificationScope notificationScope;

    public APINotificationPlan() {

    }

    public APINotificationPlan(
            Long id, String name, Long handlerId, String handlerEmail, String contentTemplate, String subjectTemplate,
            Date createTime, Date updateTime, Date sentTime,
            APINotificationChannel notificationChannel,
            APINotificationScope notificationScope) {
        super(id);
        this.name = name;
        this.handlerId = handlerId;
        this.handlerEmail = handlerEmail;
        this.contentTemplate = contentTemplate;
        this.subjectTemplate = subjectTemplate;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.sentTime = sentTime;
        this.notificationChannel = notificationChannel;
        this.notificationScope = notificationScope;
    }

    public Long getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
    }

    public String getHandlerEmail() {
        return handlerEmail;
    }

    public void setHandlerEmail(String handlerEmail) {
        this.handlerEmail = handlerEmail;
    }

    public String getContentTemplate() {
        return contentTemplate;
    }

    public void setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    public String getSubjectTemplate() {
        return subjectTemplate;
    }

    public void setSubjectTemplate(String subjectTemplate) {
        this.subjectTemplate = subjectTemplate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public APINotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    public void setNotificationChannel(APINotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public APINotificationScope getNotificationScope() {
        return notificationScope;
    }

    public void setNotificationScope(APINotificationScope notificationScope) {
        this.notificationScope = notificationScope;
    }

    @Override
    protected <T extends APIEntity> void clone(T from) {
        APINotificationPlan notificationPlan = (APINotificationPlan) from;
        cloneBase(from);
        this.name = notificationPlan.name;
        this.handlerId = notificationPlan.handlerId;
        this.handlerEmail = notificationPlan.handlerEmail;
        this.contentTemplate = notificationPlan.contentTemplate;
        this.subjectTemplate = notificationPlan.subjectTemplate;
        this.createTime = notificationPlan.createTime;
        this.updateTime = notificationPlan.updateTime;
        this.sentTime = notificationPlan.sentTime;
        this.notificationChannel = notificationPlan.notificationChannel;
        this.notificationScope = notificationPlan.notificationScope;
    }

}
