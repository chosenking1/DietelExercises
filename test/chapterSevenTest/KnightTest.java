package chapterSevenTest;

import chapterSeven.Knight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnightTest {
    private Knight knight;
    @BeforeEach
    public void setUp(){
        knight = new Knight();
    }

    @Test
    void knightExist(){
        assertNotNull(knight.getBoard());
    }

    @Test
    void boardCanBeMarked(){
        knight.setMark(1);
        assertEquals(1, knight.getBoard()[1][5]);
    }

    @Test
    void boardMarkMoves(){
        knight.setMark(1);
        knight.setMark(5);

        assertEquals(2,knight.getBoard()[3][4]);
    }

    @Test
    void boardNumbersIncrease(){
        knight.setMark(1);
        knight.setMark(5);
        assertEquals(2,knight.getBoard()[3][4]);
    }

    @Test
    void markCantGoLandOffTheChessboard(){
        knight.setMark(1);
        try{knight.setMark(1);}
        catch (ArrayIndexOutOfBoundsException e){
        assertEquals(ArrayIndexOutOfBoundsException.class,e.getClass());
//        assertEquals("The Move is Invalid", e.getMessage());
        }


    }

    @Test

    void aPlaceMarkedCantBeRemarked(){}
}
