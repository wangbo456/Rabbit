package com.zm.bean;

import java.io.Serializable;

public class Powar implements Serializable{

    private static final long serialVersionUID = 7270343551772877698L;
    private Integer p_id;
    private String  p_text;
    private String  p_url;
    private Integer p_parentid;
    private String  p_icon;
    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_text() {
        return p_text;
    }

    public void setP_text(String p_text) {
        this.p_text = p_text;
    }

    public String getP_url() {
        return p_url;
    }

    public void setP_url(String p_url) {
        this.p_url = p_url;
    }

    public Integer getP_parentid() {
        return p_parentid;
    }

    public void setP_parentid(Integer p_parentid) {
        this.p_parentid = p_parentid;
    }

    public String getP_icon() {
        return p_icon;
    }

    public void setP_icon(String p_icon) {
        this.p_icon = p_icon;
    }

    @Override
    public String toString() {
        return "Powar{" +
                "p_id=" + p_id +
                ", p_text='" + p_text + '\'' +
                ", p_url='" + p_url + '\'' +
                ", p_parentid=" + p_parentid +
                ", p_icon='" + p_icon + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
