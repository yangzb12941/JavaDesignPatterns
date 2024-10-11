package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<MementoIF> mementoList = new ArrayList<MementoIF>();

    public void add(MementoIF memento) {
        mementoList.add(memento);
    }

    public MementoIF get(int index) {
        return mementoList.get(index);
    }
}
