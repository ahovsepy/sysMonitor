package am.test.sysMonitor.listener;

import devices.DeviceManager;
import devices.PrinterManager;

public class PrinterListener  implements DeviceListener{

    public void listen() {
        // TODO  - printer listener source is here
        DeviceManager printer = new PrinterManager();
        printer.printStatus();
        
    }

}
