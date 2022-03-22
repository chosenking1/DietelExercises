package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.*;

class TurtleTest {

    Turtle ijapa;
    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleExist() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleHasAPenTest() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertNotNull(pen);
    }

    @Test
    public void penIsUpByDefaultTest() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertEquals(pen.getState(), UP);
    }

    private void assertEquals(PenState state, PenState up) {
    }

    @Test
    public void turtleCanMovePenDown() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        //GIVEN
        assertSame(ijapa.getPen().getState(), UP);
        //WHEN
        ijapa.penDown();
        //ASSERT
        assertSame(ijapa.getPen().getState(), DOWN);
        //Instead of repeatiine PenState.UP Or PenState.DOWN... WE CAN IMPORT THE STATIC CLASS AND JUST WRITE DOWN OR UP

    }
    @Test
    public void turtleCanMovePenUp() {
        // given
        ijapa.penDown();
        assertSame(ijapa.getPen().getState(), DOWN);
        //WHEN
        ijapa.penUp();
        //assert
        assertSame(ijapa.getPen().getState(), UP);
    }@Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(), EAST);
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        ijapa.turnRight();
        assertSame(WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),NORTH);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingEastTest() {
        assertSame(ijapa.getCurrentDirection(), EAST);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
    }
    @Test
    public void turtleCanMove_whileFacingEastTest(){
        ijapa.moveWhilePenDown(5);
        ijapa.moveWhilePenDown(6);
        Position expected = new Position(0,9);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_whileFacingSouthTest(){
        ijapa.turnRight();
        ijapa.moveWhilePenDown(6);
        Position expected = new Position(5,0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    private void assertEquals(Position expected, Position currentPosition) {
    }

    @Test
    public void turtleCanMove_whileFacingWestTest(){
        ijapa.moveWhilePenDown(6);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.moveWhilePenDown(6);
        Position expected = new Position(0,0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMove_whileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.moveWhilePenDown(6);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.moveWhilePenDown(6);
        Position expected = new Position(0,0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }
@Test void turtleCanWrite_whenPenIsDownTest(){
       ijapa.penDown();
       SketchPad pad = new SketchPad(5,5);

       ijapa.move(5,pad);

       //assert
    assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    int[][] floor = pad.getFloor();
    assertEquals(1, floor[0][0]);
    assertEquals(1, floor[0][1]);
    assertEquals(1, floor[0][2]);
    assertEquals(1, floor[0][3]);
    assertEquals(1, floor[0][4]);

    assertEquals(new Position(0,4),ijapa.getCurrentPosition());
    pad.display();
}

    private void assertEquals(int i, int i1) {
    }
    @Test
    public void whenTurtleOutOfSketchpad_exceptionIsThrown(){
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        ijapa.move(3,sketchPad);
        assertThrows(InvalidMoveException.class,()-> ijapa.move(5,sketchPad));
//        try{
//            ijapa.move(5,sketchPad);
//        }
//        catch(InvalidMoveException eee){
//            assertEquals(InvalidMoveException.class, eee.getClass());
//            assertEquals("Ijapa don fall", eee.getMessage());
//        }

    }

    @Test
    public void turtleCanWriteWhenFacingSouth(){
        ijapa.penDown();
        ijapa.turnRight();
        SketchPad pad = new SketchPad(5,5);

        ijapa.move(5,pad);

        //assert
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        int[][] floor = pad.getFloor();
        ijapa.turnRight();
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);

        assertEquals(new Position(4,4),ijapa.getCurrentPosition());
        pad.display();
    }

    @Test
    public void turtleCanWriteWhenFacingWest(){

    }

    @Test
    public void turtleCanWriteWhenFacingNorth(){

    }




   
}
