public class House {
    private static String _wall;
    private static String _floor;
    private static String _garage;
    private static String _pool;
    private static String _roof;
    private static String _base;

    public static void SetWall(String w){
        _wall=w;
    }
    public static void SetFloor(String w){
        _floor=w;
    }
    public static void SetGarage(String w){
        _garage=w;
    }
    public static void SetPool(String w){
        _pool=w;
    }
    public static void SetRoof(String w){
        _roof=w;
    }
    public static void SetBase(String b){
        _base=b;
    }

    public static String GetWall(){
        return _wall;
    }
    public static String GetFloor(){
        return _floor;
    }
    public static String GetGarage(){
        return _garage;
    }
    public static String GetPool(){
        return _pool;
    }
    public static String GetRoof(){
        return _roof;
    }
    public static String GetBase(){
        return _base;
    }

    public void  print (){
        System.out.println("\n"+House.GetBase()+"\n"+House.GetFloor()+"\n"+House.GetWall()+"\n"+House.GetRoof()+"\n"+House.GetGarage()+"\n"
                +House.GetPool()+"\n");
    }
}
