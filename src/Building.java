public class Building {
    private String type;
    public void initialize (String type) {
        this.type = type;
        System.out.print("Здание: " + type);}
    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
        building.initialize("Ресторан");
    }

}
