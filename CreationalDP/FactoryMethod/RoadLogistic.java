
public class RoadLogistic extends CreatorLogistic{
    @Override
    protected ProductTransport createTransport (){
        ProductTransport transport = new Truck();
        return transport;
    }
}