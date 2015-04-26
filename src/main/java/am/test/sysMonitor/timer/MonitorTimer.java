package am.test.sysMonitor.timer;

import java.util.TimerTask;

import devices.CPUUsageManager;
import devices.DeviceManager;
import devices.PrinterManager;

public class MonitorTimer extends TimerTask {


    @Override
    public void run() {
        DeviceManager printer = new PrinterManager();
        printer.printStatus();
        
        DeviceManager cpuUsage = new CPUUsageManager();
        cpuUsage.printStatus();
        
    }

}
