package shafin.shareride;

/**
 * Created by shafins on 6/12/17.
 */

public class PostInformation {
    public String from,to,time,vehicle,id,userName;

    public PostInformation() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PostInformation(String from, String to, String time, String vehicle , String id, String userName) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.vehicle = vehicle;
        this.id = id;
        this.userName = userName;

    }

    public String getFrom() {
        return from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public String getTime() {
        return time;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
