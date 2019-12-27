package com.boot.po;

import java.io.Serializable;

public class ItripTradeEnds  implements Serializable {
    private Long id;

    private String orderno;

    private Boolean flag;

    public ItripTradeEnds(Long id, String orderno, Boolean flag) {
        this.id = id;
        this.orderno = orderno;
        this.flag = flag;
    }

    public ItripTradeEnds() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}