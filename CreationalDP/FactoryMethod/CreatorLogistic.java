

public abstract class CreatorLogistic{
    public void planDelivery(){
        ProductTransport transport = createTransport();
        transport.deliver();
    }
    // factory method
    protected abstract ProductTransport createTransport();
}