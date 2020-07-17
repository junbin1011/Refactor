package api;

public class ReplaceFunctionWithCommand {


    float score(Candidate candidate, MedicalExam medicalExam, ScoringGuide scoringGuide) {
        int result = 0;
        int healthLevel = 0;
        boolean highMedicalRiskFlag = false;
        if (medicalExam.isSmoker) {
            healthLevel += 10;
            highMedicalRiskFlag = true;
        }
        String certificationGrade = "regular";
        if (scoringGuide.stateWithLowCertification(candidate.originState)) {
            certificationGrade = "low";
            result -= 5;
        }
        // lots more code like this
        result -= Math.max(healthLevel - 5, 0);
        return result;
    }

    float scoreRefactor(Candidate candidate, MedicalExam medicalExam, ScoringGuide scoringGuide) {
        return new Scorer(candidate, medicalExam, scoringGuide).execute();
    }

}

class MedicalExam {

    boolean isSmoker;
}

class Candidate {
    int originState;

}

class ScoringGuide {
    boolean stateWithLowCertification(int state) {
        return true;
    }
}


class Scorer {
    Candidate candidate;
    MedicalExam medicalExam;
    ScoringGuide scoringGuide;

    public Scorer(Candidate candidate, MedicalExam medicalExam, ScoringGuide scoringGuide) {
        this.candidate = candidate;
        this.medicalExam = medicalExam;
        this.scoringGuide = scoringGuide;
    }

    float execute() {
        int result = 0;
        int healthLevel = 0;
        boolean highMedicalRiskFlag = false;
        if (medicalExam.isSmoker) {
            healthLevel += 10;
            highMedicalRiskFlag = true;
        }
        String certificationGrade = "regular";
        if (scoringGuide.stateWithLowCertification(candidate.originState)) {
            certificationGrade = "low";
            result -= 5;
        }
        // lots more code like this
        result -= Math.max(healthLevel - 5, 0);
        return result;
    }
}