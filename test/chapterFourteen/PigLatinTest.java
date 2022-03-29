package chapterFourteen;

import assignmentsAndClassworks.PigLatin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigLatinTest {
    @Test
    void testCanPrintLatin(){
        PigLatin pigLatin = new PigLatin();
        String result = PigLatin.printLatinWord("computer");
        assertEquals("omputercay",result);
    }
}
