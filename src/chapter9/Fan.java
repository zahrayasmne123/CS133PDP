package chapter9;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String colour = "blue";


    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }


    public boolean getOn(){
        return this.on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColour(){
        return this.colour;
    }

    public void setColour(String  colour){
        this.colour = colour;
    }


    public Fan(){
    }

    public String toString() {
        if (on) {
            return String.format("Speed: %d, Color: %s, Radius: %f, Fan is on", speed, colour, radius);
        } else {
            return String.format("Color: %s, Radius: %f, Fan is off", colour, radius);
        }
    }
}
