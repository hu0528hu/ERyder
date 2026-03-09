public class ERyder {

    private final int normalValue=30;

    private String bikeID;
    private int batterylevel;
    private boolean isAvailable;
    private double kmDriven;

    public  void ride(){
        if(isAvailable && batterylevel>=normalValue){
            System.out.println("The bike is available");
        }else{
            System.out.println("The bike is not available");
        }
      
    }

    public void printBikeDetails(){
        System.out.println("BikeID:                     "+bikeID);
        System.out.println("Battery level:              "+batterylevel);
        System.out.println("Availability:               "+isAvailable);
        System.out.println("Distance travelled in km:   "+kmDriven);
    }

    public void setBatterylevel(int batterylevel){
        if(batterylevel>=0 && batterylevel<=100){
            this.batterylevel=batterylevel;
        }else{
            System.out.println( "The batterylevel is wrong");
        }
    }

    public ERyder(){
        this.bikeID="112233";
        this.batterylevel=1;
        this.isAvailable=true;
        this.kmDriven=1.0;
    }

    public ERyder(String bikeID,int batterylevel,boolean isAvailable,double kmDriven){
        this.bikeID=bikeID;
        this.batterylevel=batterylevel;
        this.isAvailable=isAvailable;
        this.kmDriven=kmDriven;
    }


}
