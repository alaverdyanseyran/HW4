package com.example.sey.homework4;

import java.util.Date;

class Message {
    public String mess;
    public boolean isMine;
    public Date date;
    public User mUser;

    public Message(String mess, boolean isMine, Date date, User mUser) {
        this.mess = mess;
        this.isMine = isMine;
        this.date = date;
        this.mUser = mUser;
    }
}