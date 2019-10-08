public abstract class BuildHouse extends House {
    protected House _house;

    public House Gethouse()
    {
        if(_house==null)
            return new House();
        return _house;
    }

    public  abstract void SetBase();
    public  abstract void  SetWall();
    public  abstract void SetFloor();
    public  abstract void SetRoof();
    public  abstract void  SetGarage();
    public  abstract void SetPool();

}
