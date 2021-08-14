package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    private int left, top, width, height;

    public void setAll(int width, int height, int top, int left) {
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public void setTopLeft (int top, int left) {
        this.width = 0;
        this.height = 0;
        this.top = 5;
        this.left = 9;
    }

    public void setWidth (int width, int left, int top) {
        this.width = width;
        this.height = width;
        this.left = 5;
        this.top = 5;
    }

    public static void main(String[] args) {

    }
}
