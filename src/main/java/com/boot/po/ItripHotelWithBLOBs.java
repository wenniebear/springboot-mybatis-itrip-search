package com.boot.po;

import java.util.Date;

public class ItripHotelWithBLOBs extends ItripHotel {
    private String details;

    private String facilities;

    private String hotelpolicy;

    public ItripHotelWithBLOBs(Long id, String hotelname, Long countryid, Long provinceid, Long cityid, String address, Integer hoteltype, Integer hotellevel, Integer isgrouppurchase, String redundantcityname, String redundantprovincename, String redundantcountryname, Integer redundanthotelstore, Date creationdate, Long createdby, Date modifydate, Long modifiedby, String details, String facilities, String hotelpolicy) {
        super(id, hotelname, countryid, provinceid, cityid, address, hoteltype, hotellevel, isgrouppurchase, redundantcityname, redundantprovincename, redundantcountryname, redundanthotelstore, creationdate, createdby, modifydate, modifiedby);
        this.details = details;
        this.facilities = facilities;
        this.hotelpolicy = hotelpolicy;
    }

    public ItripHotelWithBLOBs() {
        super();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(String hotelpolicy) {
        this.hotelpolicy = hotelpolicy == null ? null : hotelpolicy.trim();
    }
}