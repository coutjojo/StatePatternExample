package edu.dhbw.exam.StateDesign.Example.States;

import edu.dhbw.exam.StateDesign.Example.Elevator;

public class DoorClose implements ElevatorState{


    Elevator elevatorContext = null;

    public DoorClose(Elevator elevator){
        this.elevatorContext = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("Doors are Opening");
        elevatorContext.setCurrentState(elevatorContext.getDoorOpen());
    }

    @Override
    public void closeDoor() {
        System.out.println("Doors already closed");
    }

    @Override
    public void moveToFloor(int floor) {
        System.out.println("Elevator is moving to floor "+floor);
        elevatorContext.setCurrentState(elevatorContext.getMoving());
        elevatorContext.setEndTime(System.currentTimeMillis()+elevatorContext.getTimePerFloor()*Math.abs(elevatorContext.getCurrentFloor()-floor));
    }
}
