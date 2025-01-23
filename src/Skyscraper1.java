public class Skyscraper1 {
    public Skyscraper1() {
        System.out.println("Небоскреб построен");
    }
    public Skyscraper1(int floor){
        System.out.println("Небоскреб построен. количество этажей - " + floor);
    }
    public Skyscraper1(String zastroizhik){
        System.out.println("Небосктреб построен. застройщик - " + zastroizhik);
    }
    public static void main(String[] args) {
        Skyscraper1 skyscraper1= new Skyscraper1();
        Skyscraper1 skyscraper2 = new Skyscraper1(50);
        Skyscraper1 skyscraper3 = new Skyscraper1("JavaRushDevelopment");
    }
}