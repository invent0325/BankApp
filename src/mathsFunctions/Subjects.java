package mathsFunctions;

import static java.lang.Boolean.TRUE;

public class Subjects {

    String subjectName;
    String subjectTeacherName;
    int subjectDuration;
    int subjectPassingMarks;
    boolean attendedMandtory = TRUE;

    public Subjects(String subjectName, String subjectTeacherName, int subjectDuration, int subjectPassingMarks) {
        this.subjectName = subjectName;
        this.subjectTeacherName = subjectTeacherName;
        this.subjectDuration = subjectDuration;
        this.subjectPassingMarks = subjectPassingMarks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectTeacherName() {
        return subjectTeacherName;
    }

    public void setSubjectTeacherName(String subjectTeacherName) {
        this.subjectTeacherName = subjectTeacherName;
    }

    public int getSubjectDuration() {
        return subjectDuration;
    }

    public void setSubjectDuration(int subjectDuration) {
        this.subjectDuration = subjectDuration;
    }

    public int getSubjectPassingMarks() {
        return subjectPassingMarks;
    }

    public void setSubjectPassingMarks(int subjectPassingMarks) {
        this.subjectPassingMarks = subjectPassingMarks;
    }

    public boolean isAttendedMandtory() {
        return attendedMandtory;
    }

    public void setAttendedMandtory(boolean attendedMandtory) {
        this.attendedMandtory = attendedMandtory;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectTeacherName='" + subjectTeacherName + '\'' +
                ", subjectDuration=" + subjectDuration +
                ", subjectPassingMarks=" + subjectPassingMarks +
                ", attendedMandtory=" + attendedMandtory +
                '}';
    }
}
