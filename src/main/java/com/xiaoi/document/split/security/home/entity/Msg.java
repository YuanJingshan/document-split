package com.xiaoi.document.split.security.home.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/5/24.
 */
@Entity
public class Msg {

    @Id
    private String title;
    private String content;
    private String extraInfo;

    public Msg() {
    }

    public Msg(String title, String content, String extraInfo) {
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
