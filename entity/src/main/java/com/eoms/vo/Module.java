package com.eoms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Module implements Serializable {

    private String Hideheader;

    private String Hidechildren;

    private String icon;

    private String title;

    private String show;

    private String metaHiddenheadercontent;

    public String getMetaHiddenheadercontent() {
        return metaHiddenheadercontent;
    }

    public void setMetaHiddenheadercontent(String metaHiddenheadercontent) {
        this.metaHiddenheadercontent = metaHiddenheadercontent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getHideheader() {
        return Hideheader;
    }

    public void setHideheader(String hideheader) {
        Hideheader = hideheader;
    }

    public String getHidechildren() {
        return Hidechildren;
    }

    public void setHidechildren(String hidechildren) {
        Hidechildren = hidechildren;
    }
}
