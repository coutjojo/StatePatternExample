package edu.dhbw.StateDesign.Example;

import edu.dhbw.exam.StateDesign.Example.Elevator;

public class Demo {

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            System.out.println("Fehler bei der Anwendung des neuen Look-and-Feel's : " + e);
//        }
        //edu.dhbw.StateDesign.Example.Gui.Window.getInstance();
        Elevator elevator = new Elevator(0);
        System.out.println("Try to call Move");
        elevator.moveToFloor(1);
        elevator.closeDoor();
        elevator.moveToFloor(1);
        elevator.openDoor();
        try {
            Thread.sleep(1500);
        }catch(Exception e){

        }
        elevator.openDoor();
    }
}
