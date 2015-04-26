package am.test.sysMonitor.utils;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import com.sun.management.OperatingSystemMXBean;

public class MonitorUtils {

    public static int printerCount = 0;
    public static ArrayList<String> printerNames = new ArrayList<String>();
    public static ArrayList<String> currentPrinters = null;
    
    public static long currentPhysicalMemorySize = 0;
    public static long physicalMemorySize = 0;
    public static long currentPhysicalfreeMemorySize = 0;
    public static long physicalfreeMemorySize = 0;
    public static final int mb = 1024 * 1024;
    
    public static ArrayList<String> getPrintersList() {
        ArrayList<String> printers = new ArrayList<String>();
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(
                null, null);
        for (PrintService printer : printServices) {
            printers.add(printer.getName());
        }
        return printers;
    }

    public static void printChanges(String title, ArrayList<String> list) {
        for (String obj : list) {
            System.out.println(title + " " + obj);
        }

    }

    public static void printPrintersStatus() {
        if (currentPrinters == null) {
            currentPrinters = new ArrayList<String>();
            currentPrinters = getPrintersList();
            printChanges("New device: ", currentPrinters);
        } else {
            currentPrinters = getPrintersList();
            ArrayList<String> add = new ArrayList<String>(currentPrinters);
            add.removeAll(printerNames);

            ArrayList<String> remove = new ArrayList<String>(printerNames);
            remove.removeAll(currentPrinters);

            printChanges("New device: ", add);
            printChanges("Removed device: ", remove);
        }

        printerNames = currentPrinters;

    }
    
   
    public static void printCPUUsageStatus(){
        OperatingSystemMXBean os = (OperatingSystemMXBean) java.lang.management.ManagementFactory
                .getOperatingSystemMXBean();
        
        currentPhysicalMemorySize = new Long(os.getTotalPhysicalMemorySize()) / mb;
        currentPhysicalfreeMemorySize = os.getFreePhysicalMemorySize() / mb;
        
        if (currentPhysicalMemorySize != physicalMemorySize) {
            physicalMemorySize = currentPhysicalMemorySize;
            System.out.println("total physical memory : " + physicalMemorySize 
                    + "MB ");
        }
        if (currentPhysicalfreeMemorySize != physicalfreeMemorySize){
            physicalfreeMemorySize = currentPhysicalfreeMemorySize;
            System.out.println("total free physical memory : "
                    + physicalfreeMemorySize  + "MB");
        }
            
       
        
        
     

    }
    
    public static void printExternalDisplayStatus(){
        //to do  -external display  detection & print
    }
    
    public static void printUSBDevicesStatus(){
        //to do  - usb device detection & print
    }
    
}
