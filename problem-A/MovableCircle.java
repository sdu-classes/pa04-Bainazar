public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

 
    public void moveUp() {
        center.moveUp();
    }

 
    public void moveDown() {
        center.moveDown();
    }

 
    public void moveRight() {
        center.moveRight();
    }

   
    public void moveLeft() {
        center.moveLeft();
    }


    public String toString() {
        return String.format("%s, radius=%d", center.toString(),  radius);
    }

}
