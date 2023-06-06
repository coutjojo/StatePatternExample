package edu.dhbw.StateDesign.Example;

public class Elevator {

    private int currentFloor = 0;
    private final long timePerFloor = 1000;
    private long endTime = 0;
    private int destinationFloor = 0;
    private boolean isDoorClosed = false;
    private boolean isMoving = false;


    public Elevator(int initFloor){
        System.out.println("Elevator was created on Floor "+ initFloor);
        this.currentFloor = initFloor;
        this.destinationFloor = initFloor;

        System.out.println("Elevator is in State doorOpen");
    }

    public void openDoor(){
        if(!isMoving && !isDoorClosed){//State Tür Offen
            
        }else if (!isMoving && isDoorClosed){//State Tür zu

        }else if (isMoving && isDoorClosed){// State isMoving

        }else{
            System.out.println("Something broke");
        }
    }

    public void closeDoor(){
        if(!isMoving && !isDoorClosed){//State Tür Offen

        }else if (!isMoving && isDoorClosed){//State Tür zu

        }else if (isMoving && isDoorClosed){// State isMoving

        }else{
            System.out.println("Something broke");
        }
    }

    public void moveToFloor(int floor){
        if(!isMoving && !isDoorClosed){//State Tür Offen

        }else if (!isMoving && isDoorClosed){//State Tür zu

        }else if (isMoving && isDoorClosed){// State isMoving

        }else{
            System.out.println("Something broke");
        }
    }

}
