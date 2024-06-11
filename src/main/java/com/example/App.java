package com.example;

import processing.core.PApplet;

/**
 * Hello world!
 *
 */
public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.example.App");
    }

    public void settings() {
        size(400, 400, P2D);
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        fill(255);
        ellipse(mouseX, mouseY, 20, 20);
    }
}
