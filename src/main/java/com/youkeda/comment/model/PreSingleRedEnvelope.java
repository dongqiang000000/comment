package com.youkeda.comment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PreSingleRedEnvelope {

    private String id;
    private String redEnvelopeId;
    private RedEnvelope redEnvelope;
    private double redEnvelopeAmount;
    private PreSingleRedEnvelopeStatus status = PreSingleRedEnvelopeStatus.TODO;
    private String note;
    private LocalDateTime gmtCreated;
    private LocalDateTime gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRedEnvelopeId() {
        return redEnvelopeId;
    }

    public void setRedEnvelopeId(String redEnvelopeId) {
        this.redEnvelopeId = redEnvelopeId;
    }

    public RedEnvelope getRedEnvelope() {
        return redEnvelope;
    }

    public void setRedEnvelope(RedEnvelope redEnvelope) {
        this.redEnvelope = redEnvelope;
    }

    public double getRedEnvelopeAmount() {
        return redEnvelopeAmount;
    }

    public void setRedEnvelopeAmount(double redEnvelopeAmount) {
        this.redEnvelopeAmount = redEnvelopeAmount;
    }

    public PreSingleRedEnvelopeStatus getStatus() {
        return status;
    }

    public void setStatus(PreSingleRedEnvelopeStatus status) {
        this.status = status;
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

    private List<PreSingleRedEnvelope> PreSingleRedEnvelopeList;

    public List<PreSingleRedEnvelope> getPreSingleRedEnvelopeList() {
        return PreSingleRedEnvelopeList;
    }

    public void setPreSingleRedEnvelopeList(List<PreSingleRedEnvelope> preSingleRedEnvelopeList) {
        PreSingleRedEnvelopeList = preSingleRedEnvelopeList;
    }
}
