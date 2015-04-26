package am.test.sysMonitor.timer;

import java.util.TimerTask;
import am.test.sysMonitor.utils.MonitorUtils;

public class MonitorTimer extends TimerTask {


    @Override
    public void run() {
        MonitorUtils.printPrintersStatus();
        MonitorUtils.printCPUUsageStatus();
        
        MonitorUtils.printUSBDevicesStatus();
        MonitorUtils.printExternalDisplayStatus();
        
    }

}
