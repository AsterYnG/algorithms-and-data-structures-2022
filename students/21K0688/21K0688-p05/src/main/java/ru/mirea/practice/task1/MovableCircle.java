package ru.mirea.practice.task1;

public class MovableCircle implements Movable {
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed) {
        center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}
