package IT_JAVA_20240314;

public class WellAndBucket {
    public static void main(String[] args) {
        Well well = new DugWell();
        System.out.println(well.getWater());
        well = new WellWithBucket();
        System.out.println(well.getWater());
    }
}
interface Well{
    double getWater();
}

class DugWell implements Well{
    protected double volume = 1000;
    @Override
    public double getWater() {
        return 0;
    }

}

class Bucket{
    public double volume = 10;
    public void fill(){
        System.out.println("Filling the bucket with water");
    }
    public void pour(){
        System.out.println("Pouring water");
    }
}

//Adapter
class WellWithBucket extends DugWell{

    public Bucket bucket = new Bucket();
    @Override
    public double getWater() {
        bucket.fill();
        volume-=10;
        bucket.pour();
        return bucket.volume;
    }
}