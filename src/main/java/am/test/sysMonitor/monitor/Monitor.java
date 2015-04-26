package am.test.sysMonitor.monitor;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

import am.test.sysMonitor.timer.MonitorTimer;


public class Monitor 
{
    
    public static void main( String[] args ) throws Exception
    {
        //TODO -- source of listener registration is here to detect system changes and perform "listen()" action
        
    Timer timer = new Timer();
     timer.schedule(new MonitorTimer(), 1000, 1000);
    
    }

}
