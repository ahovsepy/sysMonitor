package devices;

import java.util.ArrayList;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class PrinterManager  extends DeviceManager{


    public static int printerCount = 0;
    public static ArrayList<String> printerNames = new ArrayList<String>();
    public static ArrayList<String> currentPrinters = null;
    
    public static ArrayList<String> getPrintersList() {
        ArrayList<String> printers = new ArrayList<String>();
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(
                null, null);
        for (PrintService printer : printServices) {
            printers.add(printer.getName());
        }
        return printers;
    }
    
    @Override
    public void printStatus() {
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

}
