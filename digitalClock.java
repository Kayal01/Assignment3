public class digitalClock {

    public boolean open_state = false;
    public boolean isTimer = false;
    public float timer = 0;

    public String On(){
        if(!open_state){
            open_state = true;
            return "Turned On!";
        }
        else{
            return "Already turned on";
        }
    }
    public String setTimer(float time){
        if(open_state){
            timer = time;
            isTimer = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }
    public String operate(){
        if(isTimer){
            return "Wait for timer to end";
        }
        else{
            return "Accepted";
        }
    }
    public String Off(){
        if(open_state){
            open_state = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }

}