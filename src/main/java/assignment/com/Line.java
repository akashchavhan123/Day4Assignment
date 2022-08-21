package assignment.com;

import java.awt.*;

public class Line {
    Point p1;
    Point p2;
    float length;
    float calculateLength(){
        return (float) Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.x - p2.x,2));
    }
}
