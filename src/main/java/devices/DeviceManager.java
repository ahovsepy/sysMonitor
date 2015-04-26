package devices;

import java.util.ArrayList;

public abstract class DeviceManager {
    
    public abstract void printStatus();
    
    public void printChanges(String title, ArrayList<String> list) {
        for (String obj : list) {
            System.out.println(title + " " + obj);
        }

    }


}
