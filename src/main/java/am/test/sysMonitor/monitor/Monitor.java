package am.test.sysMonitor.monitor;

import java.util.Timer;

import am.test.sysMonitor.timer.MonitorTimer;


public class Monitor 
{
    
    public static void main( String[] args ) throws Exception
    {
    Timer timer = new Timer();
    timer.schedule(new MonitorTimer(), 1000, 1000);
    
    }
        
}
