package knightProject.test;

import knightProject.BraveKnight;
import knightProject.Quest;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class BraveKnightTest {

    @Test
    public void testEmbarkOnQuest() throws Exception {

        Quest mockQuest = mock (Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify (mockQuest , times(1)).embark();

    }
}