package Exercise2;

public class RobotNG extends Robot{

    public RobotNG(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }

    /**
     * allows the robot to go forward two steps instead of one; this method checks the current direction of the robot and updates the position to move forward toward that direction by incrementing or decrementing the appropriate coordinate by 2
     */
    @Override
    public void advance(){
        super.advance();
        super.advance();
    }

    /**
     * adds "Next Generation " to the original Robot display()
     */
    @Override
    public void display(){
        System.out.print("Next Generation ");
        super.display();
    }
    
}
