package AdapterPattern.ClassAdapterPattern;

import AdapterPattern.USBImpl;
import AdapterPattern.VGA;

public class AdapterUSB2VGA extends USBImpl implements VGA {
    @Override
    public void projection() {
        super.showPPT();
    }
}
