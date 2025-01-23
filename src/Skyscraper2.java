public class Skyscraper2 {
    private int Floorscount;
    private String developer;
    public Skyscraper2(){
        Floorscount = 5;
        developer = "JavaRushDevelopment";
    }
    public Skyscraper2(int Floorscount, String developer){
        this.Floorscount = Floorscount;
        this.developer = developer;
    }
    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        System.out.println(skyscraper.Floorscount);
        Skyscraper2 skyscraper2 = new Skyscraper2(50,"JavaRushDevelopment");
        System.out.println(skyscraper2.developer);
    }
}