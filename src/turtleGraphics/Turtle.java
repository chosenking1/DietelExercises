package turtleGraphics;

import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.DOWN;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    public Pen getPen() {
        return biro;
    }

    public void penDown() {

        biro.setState(DOWN);
    }

    public void penUp() {
        biro.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
    public void turnRight(){
        if(currentDirection == SOUTH)face(WEST);
        else if(currentDirection == EAST) face(SOUTH);
        else if(currentDirection == NORTH) face(EAST);
        else if(currentDirection == WEST) face (NORTH);

    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if(currentDirection == EAST)face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face (EAST);
    }

    public void moveWhilePenDown(int numberOfSteps) {

        if(currentDirection == EAST) increaseColumnBy(numberOfSteps-1);
        if(currentDirection == SOUTH)increaseRowBy(numberOfSteps-1);
        if(currentDirection == WEST)decreaseColumnBy(numberOfSteps-1);
        if(currentDirection == NORTH)decreaseRowBy(numberOfSteps-1);

    }

    private void decreaseRowBy(int decrease) {currentPosition.setColumn(currentPosition.getRow()-decrease);
    }

    private void decreaseColumnBy(int number) {
        currentPosition.setColumn(currentPosition.getColumn()-number);
    }

    private void increaseRowBy(int increase) {
        currentPosition.setRow(currentPosition.getRow()+increase);
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn(currentPosition.getColumn()+increase);

    }

    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void move(int numberOfSteps, SketchPad sketchPad) {
        validateMove(numberOfSteps, sketchPad);
        if (biro.getState().equals(DOWN)) {
            write(numberOfSteps,sketchPad);
        }
        moveWithoutWriting(numberOfSteps);

    }

    private void validateMove(int numberOfSteps, SketchPad sketchPad)  {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                int newMove = column + numberOfSteps;
                int sketchPadColumnLength = sketchPad.getFloor()[row].length;
                if (newMove > sketchPadColumnLength) throw new InvalidMoveException("Ijapa don fall");
            }
        }
    }

    private void moveWithoutWriting(int numberOfSteps) {
        if (currentDirection == EAST) increaseColumnBy(numberOfSteps -1);
        if (currentDirection == SOUTH) increaseRowBy(numberOfSteps-1);
    }

    public void write(int noOfSteps, SketchPad sketchPad){
        int[][] floor = sketchPad.getFloor();
        int row= currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                for(int i= column; i < column+noOfSteps; i++){
                    floor[row][i] = 1;
//                    sketchPad.display();
                }
            }
            case SOUTH -> {
                for (int i= row; i < row + noOfSteps; i++){
                    floor[i][column] = 1;
                }
            }
        }

    }
}
