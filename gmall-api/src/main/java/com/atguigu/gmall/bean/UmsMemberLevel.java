package com.atguigu.gmall.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class UmsMemberLevel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String growthPoint;
    private String defaultStatus;
    private String freeFreightPoint;
    private int commentGrowthPoint;
    private int priviledgeFreeFreight;
    private int priviledgeSign_in;
    private int priviledgeComment;
    private int priviledgePromotion;
    private int priviledgeMemberPrice;
    private int priviledgeBirthday;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(String growthPoint) {
        this.growthPoint = growthPoint;
    }

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(String freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public int getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(int commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public int getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(int priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public int getPriviledgeSign_in() {
        return priviledgeSign_in;
    }

    public void setPriviledgeSign_in(int priviledgeSign_in) {
        this.priviledgeSign_in = priviledgeSign_in;
    }

    public int getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(int priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public int getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(int priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public int getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(int priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public int getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(int priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
