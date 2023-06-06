package edu.dhbw.exam.StateDesign.Example;

import edu.dhbw.exam.StateDesign.Example.States.ElevatorState;
import edu.dhbw.exam.StateDesign.Example.States.DoorClose;
import edu.dhbw.exam.StateDesign.Example.States.DoorOpen;
import edu.dhbw.exam.StateDesign.Example.States.Moving;

public class Elevator {

    private ElevatorState doorClose = null;
    private ElevatorState doorOpen = null;
    private ElevatorState moving = null;

    private ElevatorState currentState = null;


    private int currentFloor = 0;
    private final long timePerFloor = 1000;
    private long endTime = 0;
    private int destinationFloor = 0;


    public Elevator(int initFloor){
        System.out.println("Elevator was created on Floor "+ initFloor);
        this.currentFloor = initFloor;
        this.destinationFloor = initFloor;

        doorClose = new DoorClose(this);
        doorOpen = new DoorOpen(this);
        moving = new Moving(this);
        setCurrentState(doorOpen);
        System.out.println("Elevator is in State doorOpen");
    }

    public void openDoor(){
        this.currentState.openDoor();
    }

    public void closeDoor(){
        this.currentState.closeDoor();
    }

    public void moveToFloor(int floor){
        this.currentState.moveToFloor(floor);
    }

    public void setCurrentState( ElevatorState state){
        this.currentState = state;
    }

    public ElevatorState getCurrentState() {
        return currentState;
    }

    public ElevatorState getDoorOpen() {
        return doorOpen;
    }

    public ElevatorState getMoving() {
        return moving;
    }

    public ElevatorState getDoorClose() {
        return doorClose;
    }

    public long getTimePerFloor() {
        return timePerFloor;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}
