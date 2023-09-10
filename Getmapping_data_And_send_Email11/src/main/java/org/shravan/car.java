package org.shravan;

import org.springframework.stereotype.Component;

@Component
public class car {

    public String color;

    public void setColor(String color) {
        this.color = color;
    }

    public car() {
        this.color = "Golden";
        System.out.println("Car Object created!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public car(String color) {
        System.out.println("color of the car is :" + color);
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    @Override
    public String toString() {
        return color;
    }

    public void sendEmail() {

    }
}