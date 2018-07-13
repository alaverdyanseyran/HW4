package com.example.sey.homework4;

import java.util.ArrayList;

public class User {
    public String usName, avUri, status;
    public ArrayList<Message> messages;

    public User(String usName, String avUri, String status) {
        this.usName = usName;
        this.avUri = avUri;
        this.status = status;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
