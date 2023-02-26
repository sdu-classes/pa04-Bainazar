public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public void moveUp() {
        y -= ySpeed;
    }


    public void moveDown() {
        y += ySpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }


    public void moveLeft() {
        x -= xSpeed;
    }


    public String toString() {
        return String.format("(%d, %d), speed=(%d, %d)", x, y, xSpeed, ySpeed);
    }

}
