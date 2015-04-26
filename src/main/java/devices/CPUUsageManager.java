package devices;

import com.sun.management.OperatingSystemMXBean;

public class CPUUsageManager  extends DeviceManager{

    public static long currentPhysicalMemorySize = 0;
    public static long physicalMemorySize = 0;
    public static long currentPhysicalfreeMemorySize = 0;
    public static long physicalfreeMemorySize = 0;
    public static final int mb = 1024 * 1024;
    
    @Override
    public void printStatus() {
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

    
}
