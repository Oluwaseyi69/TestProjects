package menstrualCycle;

import java.util.Date;

public class Notification {
    private int notificationId;
    private String message;
    private Date dateTime;
    public Notification(int notificationId,  String message) {
        this.notificationId = notificationId;
        this.message = message;
    }

    public int getNotificationId() {
        return notificationId;
    }


    public String getMessage() {
        return message;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public String getNotification(){
//        return notificationId +  " " + message;
//    }
}
