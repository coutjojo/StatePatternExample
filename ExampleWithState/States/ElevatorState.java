package edu.dhbw.exam.StateDesign.Example.States;

public interface ElevatorState {

    public void openDoor();

    public void closeDoor();

    public void moveToFloor(int floor);

}
