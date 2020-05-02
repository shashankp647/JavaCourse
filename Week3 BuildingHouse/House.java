package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;
    public House(int length , int width, int lotLength, int lotWidth){
        super(length,width,lotLength,lotWidth);
        mOwner=null;
        mPool=false;

    }
    public House(int length , int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner=owner;
        mPool=false;

    }
    public House(int length , int width, int lotLength, int lotWidth,String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String owner){
        mOwner=owner;
    }
    public void setPool(boolean pool){
        mPool=pool;

    }
       @Override
    public String toString(){

        if(mOwner==null && mPool==true){
            return "Owner: n/a; has a pool";
        }
        else if (mOwner!=null && mPool==false){

            if (mOwner!=null && mPool==false && calcLotArea()>calcBuildingArea()){
                return "Owner: "+ mOwner + ";"+" has a big open space";
            }
            else
            return "Owner:"+mOwner;
        }
        else if (mOwner!=null && mPool==true ){
            return ("Owner:"+mOwner+";"+"has a pool");
        }
        else if( mOwner!=null && mPool==true && calcLotArea()>calcBuildingArea()) {
               return "Owner:" + mOwner + ";" + "has a pool" + "; has a big open space";
           }

        else return super.toString();

    }
    @Override
        public boolean equals(Object plot) {

        House house = (House) plot;
        return plot instanceof House && (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());

    }

    
}
