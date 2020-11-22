package com.git.inner;

public class School {

    public void echo() {
        Handler handler = new Handler();
        if (Math.random() < 0.5) {
            handler.handler("Hello");
        } else {
            handler.handler("world");
        }
    }

    private class Handler {
        public void handler(String handler) {
            System.out.println(handler);
        }
    }
}
