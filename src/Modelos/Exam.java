package Modelos;

public class Exam {

    int examID;
    int duration;
    String instructions;
    String title;

public Exam(int examID,int duration, String instructions,String title){
    setExamID(examID);
    setDuration(duration);
    setInstructions(instructions);
    setTitle(title);
}
public int getDuration() {
    return duration;
}
public int getExamID() {
    return examID;
}
public String getInstructions() {
    return instructions;
}
public String getTitle() {
    return title;
}
public void setExamID(int examID) {
        this.examID = examID;
    }
public void setDuration(int duration) {
        this.duration = duration;
    }
public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
public void setTitle(String title) {
        this.title = title;
    }

}
