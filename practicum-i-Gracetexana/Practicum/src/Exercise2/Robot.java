package Exercise2;

public class Robot {
    int id;
    int x;
    int y;
    Direction direction;
    int stepsTaken;

    public Robot(int id){
        this.id = id;
        this.x = 0;
        this.y = 0;
        this.direction = Direction.EAST;
    }

    public int getID(){
        return id;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Direction getDirection(){
        return direction;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public void setDirection(Direction newDirection){
        direction = newDirection;
    }

    /**
     * allows the robot to go forward one step; this method checks the current direction of the robot and updates the position to move forward toward that direction by incrementing or decrementing the appropriate coordinate by 1
     */
    public void advance(){
        switch (direction){
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
        }

        stepsTaken++;
    }

    /**
     * outputs the robot state in detail
     */
    public void display(){
        System.out.println("Robot " + id);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Facing: " + direction);
        System.out.println("Steps taken: " + stepsTaken);
    }
}
