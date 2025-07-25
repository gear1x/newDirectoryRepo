package Study;

import java.time.LocalTime;

public class Task {
    private String name;
    private boolean completed=false;
    private int taskCode;
    LocalTime timeRegistered = LocalTime.now();
    public Task(String name, int taskCode){
        this.name=name;
        this.taskCode=taskCode;
    }
    public String getName(){
        return this.name;
    }
    public int getTaskCode(){
        return this.taskCode;
    }
    public boolean getCompetionStatus(){
        return this.completed;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setCompleted(boolean completed1){
        this.completed=completed1;
    }
    public void setTaskCode(int newTaskCode){
        this.taskCode=newTaskCode;
    }
    public void printTaskSummary(){
        System.out.println("--- Task "+this.taskCode+" summary: ---");
        System.out.println("--- Task name: "+this.name+" ---");
        System.out.println("--- Registered at: "+this.timeRegistered+" ---");
    }
}
