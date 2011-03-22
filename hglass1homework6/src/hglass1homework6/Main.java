/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hglass1homework6;

import processing.core.*;

/**
 *
 * @author Hunter
 */
public class Main extends PApplet {

    Car[] multipleCars = new Car[10];

    @Override
    public void setup() {
        size(500, 500);
        smooth();
        //creates a loop that will setup the 10 cars spaced out while i is less than the length of the array
        for (int i = 0; i < multipleCars.length; i++) {
            multipleCars[i] = new Car(this, i * 20, 20 + (i * 20),1);
        }

    }

    @Override
    public void draw() {
        //cars are actually being drawn, and they move to the right as long as i < the array.
        background(204);
        for (int i = 0; i < multipleCars.length; i++) {
            multipleCars[i].draw();
            multipleCars[i].moveRight();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PApplet.main(new String[]{"--present", "hglass1homework6.Main"});
    }
}
