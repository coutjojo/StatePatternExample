package edu.dhbw.exam.StateDesign.Example.States;

import edu.dhbw.exam.StateDesign.Example.Elevator;

public class DoorOpen implements ElevatorState{

    Elevator elevatorContext = null;

    public DoorOpen(Elevator elevator){
        this.elevatorContext = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("Door already Open");
    }

    @Override
    public void closeDoor() {
        System.out.println("Doors Closing");
        elevatorContext.setCurrentState(elevatorContext.getDoorClose());
    }

    @Override
    public void moveToFloor(int floor) {
        System.out.println("Please close the Doors before entering a floor");
    }

}
