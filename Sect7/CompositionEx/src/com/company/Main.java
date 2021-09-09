package com.company;

public class Main {

    public static void main(String[] args) {
    Door theDoor = new Door(false);
    Floor theFloor = new Floor(false);
    Bed theBed = new Bed(false);
    Room theRoom = new Room(theBed, theDoor, theFloor);

    theRoom.catSpawn();
    theRoom.catTravel(theDoor);
    theRoom.showCat();
    theRoom.catTravel(theBed);
    theBed.catSleep();
    theRoom.catTravel(theFloor);
    theRoom.catTravel(theDoor);
    theDoor.catExit();
    theRoom.showCat();
    }
}
