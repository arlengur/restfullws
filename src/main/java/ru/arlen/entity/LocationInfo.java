package ru.arlen.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "locationinfo")
public class LocationInfo implements Serializable {
    @XmlElement(name = "trackingId")
    private BigDecimal trackingId;
    @XmlElement(name = "recordNumber")
    private int recordNumber;
    @XmlElement(name = "latitude")
    private int latitude;
    @XmlElement(name = "longitude")
    private int longitude;
    @XmlElement(name = "speed")
    private int speed;
    @XmlElement(name = "heading")
    private int heading;
    @XmlElement(name = "elevation")
    private int elevation;
    @XmlElement(name = "agedStatus")
    private String agedStatus;
    @XmlElement(name = "ehpe")
    private int ehpe;

    public BigDecimal getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(BigDecimal trackingId) {
        this.trackingId = trackingId;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getAgedStatus() {
        return agedStatus;
    }

    public void setAgedStatus(String agedStatus) {
        this.agedStatus = agedStatus;
    }

    public int getEhpe() {
        return ehpe;
    }

    public void setEhpe(int ehpe) {
        this.ehpe = ehpe;
    }

    @Override
    public String toString() {
        return "LocationInfo = [" +
                "\n\t trackingId= " + trackingId +
                "\n\t recordNumber= " + recordNumber+
                "\n\t latitude= " + latitude +
                "\n\t longitude= " + longitude +
                "\n\t speed= " + speed +
                "\n\t heading= " + heading +
                "\n\t elevation= " + elevation +
                "\n\t agedStatus= " + agedStatus +
                "\n\t ehpe= " + ehpe + "\n]";
    }
}
