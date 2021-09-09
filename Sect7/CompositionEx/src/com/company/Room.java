package com.company;

public class Room {
    private Bed theBed;
    private Door theDoor;
    private Floor theFloor;

    public Room(Bed theBed, Door theDoor, Floor theFloor) {
        this.theBed = theBed;
        this.theDoor = theDoor;
        this.theFloor = theFloor;
    }

    public void catSpawn() {
        System.out.println("Cat has spawned on the door.");
        theDoor.setCat(true);
    }

    public Platform whereIsCat() {
        if (theBed.isCat() == true) {
            System.out.println("The cat is at" + theBed.getObject());
            return theBed;
        }
        else if (theDoor.isCat() == true) {
            System.out.println("The cat is at " + theDoor.getObject());
            return theDoor;
        }
        else if (theFloor.isCat() == true) {
            System.out.println("The cat is at " + theFloor.getObject());
            return theFloor;
        }
        else {
            System.out.println("The cat is not in the room");
            return null;
        }
    }

    public void catTravel(Platform thePlatform) {
        if (whereIsCat() != null) {
            whereIsCat().catLeave();
            thePlatform.catEnter();
            System.out.println("Cat has entered " + thePlatform.getObject());
        }
    }
}
