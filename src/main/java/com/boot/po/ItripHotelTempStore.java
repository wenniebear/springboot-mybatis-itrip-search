package com.boot.po;

import java.io.Serializable;
import java.util.Date;

public class ItripHotelTempStore  implements Serializable {
    private Long id;

    private Integer hotelid;

    private Long roomid;

    private Date recorddate;

    private Integer store;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    public ItripHotelTempStore(Long id, Integer hotelid, Long roomid, Date recorddate, Integer store, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.hotelid = hotelid;
        this.roomid = roomid;
        this.recorddate = recorddate;
        this.store = store;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    public ItripHotelTempStore() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
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