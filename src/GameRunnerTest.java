import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameRunnerTest {

    private MapRepository stubMapRepository;
    private GameRunner classUnderTest;

    @Before
    public void setUp() throws Exception {
        stubMapRepository = new Repository() {

            @Override
            public void save(GameRunnerResult gamerunnerResult) {

            }

        };

        ClassUnderTest new GameRunnerResult(stubMapRepository);
    }
    @Test

    public void isVictorious() {

        Submission expectedSubmission = new Submission();
        expectedSubmission.setInputNumber(10000);
        GameRunnrResult gamerunnrResult = classUnderTest.performGameRunnerLogic(expectedSubmission);
        assertEquals("Is Victorious", gamerunnerResult.getMessage());
    }

    @Test
    public void isDefeated() {
        Submission expectedSubmission = new Submission();
        expectedSubmission.setInputNumber(100);

        GameRunnerResult gamerunnerResult = classUnderTest.performGameRunnerLogic(expectedSubmission);

        assertEquals("Is Defeated", gamerunnerResult.getMessage());


    }
}
