package com.youkeda.comment.model;

import java.time.LocalDateTime;

public class RedEnvelope {

    private String id;
    private String sendUserId;
    private double redEnvelopeAmount;
    private Integer totalAmount;
    private String note;
    private LocalDateTime gmtCreated;
    private LocalDateTime gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public double getRedEnvelopeAmount() {
        return redEnvelopeAmount;
    }

    public void setRedEnvelopeAmount(double redEnvelopeAmount) {
        this.redEnvelopeAmount = redEnvelopeAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}
