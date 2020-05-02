package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    private int mLength;
    private int mbreadth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int Lenght, int Breadth, int lotLength, int lotWidth){
        mLength=Lenght;
        mbreadth=Breadth;
        mLotLength=lotLength;
        mLotWidth=lotWidth;
    }

    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mbreadth;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public void setLength(int lenght){
        mLength=lenght;
    }
    public void setWidth(int breadth){
        mbreadth=breadth;
    }
    public void setLotLength(int lotlenght){
        mLotLength=lotlenght;
    }
    public void setLotWidth(int lotwidth){
        mLotWidth=lotwidth;
    }
    public int calcBuildingArea(){
        return mLength*mbreadth;

    }
    public int calcLotArea(){
        return mLotLength*mLotWidth;
    }
    public String toString(){
        return "Owner: n/a";
    }

}
