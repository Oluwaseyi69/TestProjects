package menstrualCycle;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String userName;
    private String email;
    private String password;
    private List<Notification> notifications = new ArrayList<>();


    public User(int userId, String userName, String email, String password){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Notification findUser(int userId){
        for(Notification notification : notifications){
            if(notification.getNotificationId()==(userId)){
                return notification;
            }
        }
        throw new IllegalArgumentException("Invalid Id");
    }


    public void addUser(int notificationId, String message) {
        Notification notification = new Notification(notificationId,message);
        notifications.add(notification);
    }


    public void deleteUser(int notificationId) {
        Notification notification = findUser(notificationId);
        notifications.remove(notification);
    }

    public void updateUser(int notificationId, String message) {
        Notification notification = findUser(notificationId);
        notification.setNotificationId(notificationId);
        notification.setMessage(message);
    }

    public int getCycleLength(int firstDate, int secondDate, int thirdDate, int number) {
        //        System.out.println(length);
        return (firstDate + secondDate + thirdDate)/ number;
    }

    public int ovulationPeriod(int date) {
        int period = date / 2;
        int firstDate = period - 1;
        int secondDate = period - 2;
        return secondDate;
    }
}
