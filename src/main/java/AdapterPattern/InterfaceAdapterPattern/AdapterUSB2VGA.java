package AdapterPattern.InterfaceAdapterPattern;

import AdapterPattern.USB;
import AdapterPattern.USBImpl;
import AdapterPattern.VGA;

public abstract class AdapterUSB2VGA implements VGA {
    USB u = new USBImpl();
    @Override
    public void projection() {
        u.showPPT();
    }
}
