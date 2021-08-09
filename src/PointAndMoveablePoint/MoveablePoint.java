package PointAndMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    MoveablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    MoveablePoint(float _xSpeed, float _ySpeed) {
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    MoveablePoint(float _x, float _y, float _xSpeed, float _ySpeed) {
        super(_x, _y);
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float _xSpeed, float _ySpeed) {
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    public String toString() {
        return super.toString() +
                " Xspeed is = " + getxSpeed() +
                " Yspeed is = " + getySpeed();
    }

    public float[] move() {
        setXY(getX() + getxSpeed(), getY() + getySpeed());
        float[] arr = new float[4];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getxSpeed();
        arr[3] = getX();
        return arr;
    }

    public static void main(String[] args) {
        MoveablePoint move1 = new MoveablePoint();
        System.out.println(move1);
        MoveablePoint move2 = new MoveablePoint(0.0f, 0.0f, 2.0f,2.0f);
        System.out.println(move2);
        move2.move();
        move2.move();
        System.out.println(move2);
    }
}
