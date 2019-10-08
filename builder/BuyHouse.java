public class BuyHouse {
    private BuildHouse _housebuilder;

    public void SetHouse(BuildHouse builder)
    {
        _housebuilder=builder;
    }

    public House GetHouse()
    {
        construct();
        return _housebuilder.Gethouse();
    }

    public void construct()
    {
        _housebuilder.SetFloor();
        _housebuilder.SetGarage();
        _housebuilder.SetBase();
        _housebuilder.SetWall();
        _housebuilder.SetPool();
        _housebuilder.SetRoof();
    }
}
