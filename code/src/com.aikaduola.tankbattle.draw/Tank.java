package com.aikaduola.tankbattle;

/**
 * 坦克
 */
public class Tank {

    /** 坦克的x坐标 */
    private int x;

    /** 坦克的y坐标 */
    private int y;

    /** 坦克的方向 */
    private int direction;

    /** 坦克的移动速度 */
    private int speed;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }
}
