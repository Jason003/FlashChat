package com.jenniferlopez.flashchatnewfirebase;


class InstantMessage {

    private String message;
    private String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {//firebase database要求了必须有一个default的，没有任何参数输入的constructor


    }

    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }
}
