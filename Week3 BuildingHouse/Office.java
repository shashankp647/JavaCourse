package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName ;
    private int mParkingSpaces;
    private static int sTotalOffices=0;

    public Office(int length,int width,int lotLength,int lotWidth){
        super(length,width,lotLength,lotWidth);
        mBusinessName=null;
        mParkingSpaces=0;
        sTotalOffices+=1;
    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName){
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        sTotalOffices+=1;

    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName, int parkingSpaces){
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffices+=1;
    }
    public String getBusinessName(){
        return mBusinessName;
    }

    public int getParkingSpaces(){
        return mParkingSpaces;
    }

    public void setBusinessName(String Name){
        mBusinessName=Name;
    }

    public void setParkingSpaces(int Value){
        mParkingSpaces=Value;
    }
    @Override
    public String toString(){
       return "Business:" +
               (mBusinessName!=null?mBusinessName:" unoccupied")+
               (mParkingSpaces!=0?";has"+mParkingSpaces+"parking spaces":"")+
               " (total offices: "+sTotalOffices+")";

    }
    public boolean equals(Object plot){
        if(!(plot instanceof Office )) return false;
        Office office= (Office) plot;
        return (getParkingSpaces()==office.getParkingSpaces()) && (calcBuildingArea()==office.calcBuildingArea());


    }


    }
