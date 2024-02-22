package com.mendez.doganimation;


// trash can manhole traffic cone student fog obs
// my job is interaction with dog with obs and PUs and its animation in doing so

public abstract class PowerUp {

    protected double powerUpHitbox;
    protected double powerUpRadius;

    public void powerUpSpawn() {

    }

    public static boolean isColliding() {
        double powerUpDistance = getDistanceBetweenObjects(obj1, obj2);
        double distanceToCollision = obj1.getHitbox() + obj2.getHitbox();
        if (powerUpDistance < distanceToCollision) {
            return true;
        }
        else {
            return true;
        }
    }

    private double getHitbox() {

        return powerUpHitbox;
    }
}
