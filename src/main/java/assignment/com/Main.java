package assignment.com;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


        Line line1 = new Line();
        line1.p1 = new Point();
        line1.p1.x = 10;
        line1 .p1.y = 8;

        line1.p2 = new Point();
        line1.p2.x = 20;
        line1.p2.y = 4;

        float length = line1.calculateLength();
        System.out.println("length of line :" + length );
    }
}
