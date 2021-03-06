package com.boot.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItripHotelRoom  implements Serializable {
    private Long id;

    private Long hotelid;

    private String roomtitle;

    private BigDecimal roomprice;

    private Long roombedtypeid;

    private Integer ishavingbreakfast;

    private Integer paytype;

    private Long satisfaction;

    private Integer isbook;

    private Integer iscancel;

    private Integer istimelyresponse;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    public ItripHotelRoom(Long id, Long hotelid, String roomtitle, BigDecimal roomprice, Long roombedtypeid, Integer ishavingbreakfast, Integer paytype, Long satisfaction, Integer isbook, Integer iscancel, Integer istimelyresponse, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.hotelid = hotelid;
        this.roomtitle = roomtitle;
        this.roomprice = roomprice;
        this.roombedtypeid = roombedtypeid;
        this.ishavingbreakfast = ishavingbreakfast;
        this.paytype = paytype;
        this.satisfaction = satisfaction;
        this.isbook = isbook;
        this.iscancel = iscancel;
        this.istimelyresponse = istimelyresponse;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    public ItripHotelRoom() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getRoomtitle() {
        return roomtitle;
    }

    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle == null ? null : roomtitle.trim();
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public Long getRoombedtypeid() {
        return roombedtypeid;
    }

    public void setRoombedtypeid(Long roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    public Integer getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    public void setIshavingbreakfast(Integer ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Long getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Long satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Integer getIsbook() {
        return isbook;
    }

    public void setIsbook(Integer isbook) {
        this.isbook = isbook;
    }

    public Integer getIscancel() {
        return iscancel;
    }

    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }

    public Integer getIstimelyresponse() {
        return istimelyresponse;
    }

    public void setIstimelyresponse(Integer istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}