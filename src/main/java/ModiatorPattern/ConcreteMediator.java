package ModiatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        // TODO Auto-generated method stub
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String to, String ad) {
        // TODO Auto-generated method stub
        for (Colleague cl : colleagues) {

            String name = cl.getName();
            if (name.equals(to)) {
                cl.receive(from, ad);
            }

        }
    }
}
