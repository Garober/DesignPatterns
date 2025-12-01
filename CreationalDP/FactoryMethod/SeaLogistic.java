public class SeaLogistic extends CreatorLogistic{

    @Override
    protected ProductTransport createTransport (){
        ProductTransport transport = new Ship();
        return transport;
    }
}