public class Bugatti {

    // Поля класса
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    // Конструктор по умолчанию
    public Bugatti() {
    }

    // Геттер для поля body
    public String getBody() {
        return body;
    }

    // Сеттер для поля body
    public void setBody(String body) {
        this.body = body;
    }

    // Дополнительные геттеры и сеттеры для других полей (по желанию)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        // Создаем объект Bugatti
        Bugatti bugatti = new Bugatti();

        // Получаем текущую конфигурацию кузова
        System.out.println("Текущая конфигурация кузова: " + bugatti.getBody());

        // Изменяем конфигурацию кузова
        bugatti.setBody("Convertible");
        System.out.println("Обновленная конфигурация кузова: " + bugatti.getBody());
    }
}
