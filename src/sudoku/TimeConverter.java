package sudoku;


public class TimeConverter {
    private int timecount;
    private String time;
    
    public String TimeConverter(int timecount){
        this.timecount=timecount;
    if (timecount>=3600){
        int hours=timecount/3600;
        int b=hours*3600;
        int minutes=(int)((timecount-b)/60);
        int a=minutes*60;
        int seconds=timecount-a-b;
        
        if (minutes<10&&seconds<10){
            time=(hours+":0"+minutes+":0"+seconds);
        }else if(minutes>=10&&seconds<10){
            time=(hours+":"+minutes+":0"+seconds);
        }else if(minutes<10&&seconds>=10){
            time=(hours+":0"+minutes+":"+seconds);
        }else{
          time=(hours+":"+minutes+":"+seconds);
      } 
      }else{
        int minutes=(int)(timecount/60);
        int a=minutes*60;
        int seconds=timecount-a;
        if (seconds<10){
            time=(minutes+":0"+seconds);
        }else{
          time=(minutes+":"+seconds);
      }
    }
        return time;
    }
}
