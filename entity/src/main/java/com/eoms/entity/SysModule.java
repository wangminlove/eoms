package com.eoms.entity;

public class SysModule {
    private String id;

    private String parentid;

    private String moduleLevel;

    private String moduleOrder;

    private String metaIcon;

    private String metaTitle;

    private String name;

    private String component;

    private String redirect;

    private String metaShow;

    private String metaHideheader;

    private String metaHidechildren;

    private String metaHiddenheadercontent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getModuleLevel() {
        return moduleLevel;
    }

    public void setModuleLevel(String moduleLevel) {
        this.moduleLevel = moduleLevel == null ? null : moduleLevel.trim();
    }

    public String getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(String moduleOrder) {
        this.moduleOrder = moduleOrder == null ? null : moduleOrder.trim();
    }

    public String getMetaIcon() {
        return metaIcon;
    }

    public void setMetaIcon(String metaIcon) {
        this.metaIcon = metaIcon == null ? null : metaIcon.trim();
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect == null ? null : redirect.trim();
    }

    public String getMetaShow() {
        return metaShow;
    }

    public void setMetaShow(String metaShow) {
        this.metaShow = metaShow == null ? null : metaShow.trim();
    }

    public String getMetaHideheader() {
        return metaHideheader;
    }

    public void setMetaHideheader(String metaHideheader) {
        this.metaHideheader = metaHideheader == null ? null : metaHideheader.trim();
    }

    public String getMetaHidechildren() {
        return metaHidechildren;
    }

    public void setMetaHidechildren(String metaHidechildren) {
        this.metaHidechildren = metaHidechildren == null ? null : metaHidechildren.trim();
    }

    public String getMetaHiddenheadercontent() {
        return metaHiddenheadercontent;
    }

    public void setMetaHiddenheadercontent(String metaHiddenheadercontent) {
        this.metaHiddenheadercontent = metaHiddenheadercontent == null ? null : metaHiddenheadercontent.trim();
    }
}