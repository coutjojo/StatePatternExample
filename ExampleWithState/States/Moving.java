package edu.dhbw.exam.StateDesign.Example.States;

import edu.dhbw.exam.StateDesign.Example.Elevator;

public class Moving implements ElevatorState{

    Elevator elevatorContext = null;

    public Moving(Elevator elevator){
        this.elevatorContext = elevator;
    }

    @Override
    public void openDoor() {
        if(System.currentTimeMillis()>elevatorContext.getEndTime()){
            System.out.println("Doors are Opening");
            System.out.println("welcome to floor "+elevatorContext.getCurrentFloor());
            elevatorContext.setCurrentState(elevatorContext.getDoorOpen());
            elevatorContext.setCurrentFloor(elevatorContext.getDestinationFloor());
        }else {
            System.out.println("Elevator is still moving");
        }
    }

    @Override
    public void closeDoor() {
        System.out.println("Door already closed");
    }

    @Override
    public void moveToFloor(int floor) {
        if(System.currentTimeMillis()>elevatorContext.getEndTime()){
            System.out.println("continue moving to floor  "+elevatorContext.getCurrentFloor());

        }else {
            System.out.println("Elevator is still moving");
        }
    }
}
