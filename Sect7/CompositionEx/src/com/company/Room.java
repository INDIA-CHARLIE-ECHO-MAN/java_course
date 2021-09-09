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
            return theBed;
        }
        else if (theDoor.isCat() == true) {
            return theDoor;
        }
        else if (theFloor.isCat() == true) {
            return theFloor;
        }
        else {
            System.out.println("The cat is not in the room");
            return null;
        }
    }

    public void showCat() {
        if (whereIsCat() != null) {
            System.out.println("Cat is at " + whereIsCat().getObject());
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
