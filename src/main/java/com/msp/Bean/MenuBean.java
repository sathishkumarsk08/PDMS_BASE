package com.msp.Bean;

import org.springframework.stereotype.Component;

@Component
public class MenuBean {
    private int mmId;
    private int parentId;
    private int mmLevel;
    private String icon;
    private String mmName;

    public int getMmId() {
        return mmId;
    }

    public void setMmId(int mmId) {
        this.mmId = mmId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getMmLevel() {
        return mmLevel;
    }

    public void setMmLevel(int mmLevel) {
        this.mmLevel = mmLevel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMmName() {
        return mmName;
    }

    public void setMmName(String mmName) {
        this.mmName = mmName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;
}
