public class HealthRiskAssessment {

    public String assessRisk(int bloodPressure, int bloodSugar) {
        if (bloodPressure < 0 || bloodSugar < 0) {
            return "Invalid Input";
        }

        if (bloodPressure <= 120 && bloodSugar < 100) {
            return "Normal";
        } else if ((bloodPressure >= 120 && bloodPressure <= 139) || (bloodSugar >= 100 && bloodSugar < 125)) {
            return "At Risk";
        } else if ((bloodPressure >= 140 && bloodPressure <= 159) || (bloodSugar >= 125 && bloodSugar < 154)) {
            return "Sick Level 1";
        } else if ((bloodPressure >= 160 && bloodPressure <= 179) || (bloodSugar >= 155 && bloodSugar < 182)) {
            return "Sick Level 2";
        } else if (bloodPressure >= 180 || bloodSugar >= 183) {
            return "Sick Level 3";
        } else {
            return "Invalid Input";
        }
    }
}
