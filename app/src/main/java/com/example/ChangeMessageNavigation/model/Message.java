package com.example.ChangeMessageNavigation.model;

import java.io.Serializable;

public class Message implements Serializable {

    private User user;
    private String message;
    private String timestampp;
    private int size;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestampp() {
        return timestampp;
    }

    public void setTimestampp(String timestampp) {
        this.timestampp = timestampp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Message(User user, String message, String timestampp, int size) {
        this.user = user;
        this.message = message;
        this.timestampp = timestampp;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", message='" + message + '\'' +
                ", timestampp='" + timestampp + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (!user.equals(message.user)) return false;
        return timestampp.equals(message.timestampp);
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + timestampp.hashCode();
        return result;
    }
}



