package ModiatorPattern;

public class Buyer extends Colleague{
    public Buyer(String name) {

        super(name);

    }

    @Override
    public void Send(String to, String ad) {
        // TODO Auto-generated method stub
        mediator.relay(name, to, ad);
    }

    @Override
    public void receive(String from, String ad) {
        // TODO Auto-generated method stub
        System.out.println(name + "接收到来自" + from + "的消息:" + ad);
    }
}
