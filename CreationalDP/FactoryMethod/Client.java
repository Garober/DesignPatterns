
class Client{

    public static void main(String[] args) {
        CreatorLogistic creatorLogistic;

        String type = "road";

        if(type.equalsIgnoreCase("sea")) {
            creatorLogistic = new SeaLogistic();
        }else{
            creatorLogistic = new RoadLogistic();
        }
       
        creatorLogistic.planDelivery();
    }
}