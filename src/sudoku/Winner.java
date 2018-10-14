package sudoku;

import java.io.Serializable;
import java.util.GregorianCalendar;


public class Winner implements Serializable{//иначе не будет сериализовываться и десер-ся
private String difficulty;
private String name;
private int timecnt;
private GregorianCalendar date;

public Winner(String Difficulty,String name,int timecnt,GregorianCalendar date){
    this.date=date;
    this.name=name;
    this.timecnt=timecnt;
    this.difficulty=Difficulty;
}

    public String getDifficulty() {
        return difficulty;
    }

    public String getName() {
        return name;
    }

    public int getTimecnt() {
        return timecnt;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimecnt(int timecnt) {
        this.timecnt = timecnt;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
        
}
