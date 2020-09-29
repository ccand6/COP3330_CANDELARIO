import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {
    void BodyMassIndex() {
        BodyMassIndex bmi = new BodyMassIndex(65, 150);

        System.out.print(BodyMassIndex.bmi);
    }

    @org.junit.jupiter.api.Test

    void bodyMassCategory() {
        int Category = 1;
        BodyMassIndex.BodyMassCategory();
        Category = 2;
        BodyMassIndex.BodyMassCategory();
        Category = 3;
        BodyMassIndex.BodyMassCategory();
        Category = 4;
        BodyMassIndex.BodyMassCategory();
    }
}