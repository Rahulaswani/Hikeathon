package com.hikeathon;

public class Card {
    private String Username;
    private String UserMessage;

    public Card(String Username, String UserMessage) {
        this.Username = Username;
        this.UserMessage = UserMessage;
    }

    public String getusername() {
        return Username;
    }

    public String getmessage() {
        return UserMessage;
    }

}