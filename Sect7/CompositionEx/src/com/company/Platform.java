package com.company;

public class Platform {
    private String object;
    private boolean isCat;

    public Platform(boolean isCat) {
        this.isCat = isCat;
    }

    public boolean isCat() {
        return isCat;
    }

    public void setCat(boolean cat) {
        isCat = cat;
    }

    public void catLeave() {
        setCat(false);
    }
    public void catEnter() {
        setCat(true);
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

}
