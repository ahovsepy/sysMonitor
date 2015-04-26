package am.test.sysMonitor.listener;

import devices.CPUUsageManager;
import devices.DeviceManager;

public class CPUUsageListener implements DeviceListener{

    public void listen() {
        // TODO  - cpu usage listener code is here
        DeviceManager cpuUsage = new CPUUsageManager();
        cpuUsage.printStatus();
        
    }

}
