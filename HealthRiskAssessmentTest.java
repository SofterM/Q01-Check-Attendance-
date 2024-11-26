import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HealthRiskAssessmentTest {

    @Test
    public void testAssessRiskNormal() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("Normal", assessment.assessRisk(120, 99));
    }

    @Test
    public void testAssessRiskAtRisk() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("At Risk", assessment.assessRisk(130, 110));
        assertEquals("At Risk", assessment.assessRisk(125, 100));
    }

    @Test
    public void testAssessRiskSickLevel1() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("Sick Level 1", assessment.assessRisk(150, 130));
        assertEquals("Sick Level 1", assessment.assessRisk(140, 125));
    }

    @Test
    public void testAssessRiskSickLevel2() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("Sick Level 2", assessment.assessRisk(170, 160));
        assertEquals("Sick Level 2", assessment.assessRisk(160, 155));
    }

    @Test
    public void testAssessRiskSickLevel3() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("Sick Level 3", assessment.assessRisk(180, 200));
        assertEquals("Sick Level 3", assessment.assessRisk(190, 185));
    }

    @Test
    public void testAssessRiskInvalidInput() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        assertEquals("Invalid Input", assessment.assessRisk(-1, -1));
        assertEquals("Invalid Input", assessment.assessRisk(-10, 150));
        assertEquals("Invalid Input", assessment.assessRisk(150, -20));
    }

    @Test
    public void testAssessBoundaryConditions() {
        HealthRiskAssessment assessment = new HealthRiskAssessment();
        
        assertEquals("Normal", assessment.assessRisk(120, 99));
        
        assertEquals("At Risk", assessment.assessRisk(120, 100));
        assertEquals("At Risk", assessment.assessRisk(139, 124));

        assertEquals("Sick Level 1", assessment.assessRisk(140, 125));
        assertEquals("Sick Level 1", assessment.assessRisk(159, 154));

        assertEquals("Sick Level 2", assessment.assessRisk(160, 155));
        assertEquals("Sick Level 2", assessment.assessRisk(179, 181));

        assertEquals("Sick Level 3", assessment.assessRisk(180, 183));
    }
}
