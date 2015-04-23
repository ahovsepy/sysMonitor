package am.test.sysMonitor.timer;

import java.awt.Toolkit;
import java.lang.management.ManagementFactory;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import java.util.Timer;
import java.util.TimerTask;

import am.test.sysMonitor.utils.MonitorUtils;

import com.sun.management.OperatingSystemMXBean;

public class MonitorTimer extends TimerTask {


    @Override
    public void run() {
        MonitorUtils.printPrintersStatus();
        MonitorUtils.printCPUUsageStatus();
    }

}
