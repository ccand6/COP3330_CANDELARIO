import static org.junit.jupiter.api.Assertions.*;

//This tests whether the BMI listed matches the actual calculation.
class BodyMassIndexTest {
    void BodyMassIndex() {
        new BodyMassIndex(65, 150);
        assertEquals(24.96,BodyMassIndex.bmi);
    }

    @org.junit.jupiter.api.Test

    //The following tests determine whether the measured BMIs fit into those categories.
    void bodyMassCategory() {
        new BodyMassIndex(65,100);
        BodyMassIndex.BodyMassCategory();
        assertEquals(1,BodyMassIndex.Category);
        new BodyMassIndex(65,150);
        BodyMassIndex.BodyMassCategory();
        assertEquals(2,BodyMassIndex.Category);
        new BodyMassIndex(65,175);
        BodyMassIndex.BodyMassCategory();
        assertEquals(3,BodyMassIndex.Category);
        new BodyMassIndex(65,200);
        BodyMassIndex.BodyMassCategory();
        assertEquals(4,BodyMassIndex.Category);
    }
}