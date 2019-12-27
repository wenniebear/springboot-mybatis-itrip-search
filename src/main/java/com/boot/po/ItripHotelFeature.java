package com.boot.po;

import java.io.Serializable;
import java.util.Date;

public class ItripHotelFeature  implements Serializable {
    private Long id;

    private Long hotelid;

    private Long featureid;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    public ItripHotelFeature(Long id, Long hotelid, Long featureid, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.hotelid = hotelid;
        this.featureid = featureid;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    public ItripHotelFeature() {
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

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
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