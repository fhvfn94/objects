public class person {
    private String name;
    private int age;

//    TODO: Второй способ создаем конструктор
//     Я перенес метод из класса MAIN в класс person.
//     Обязательно метод вставляем по обьявлением переменной.
//     Если класс назван так же как и метод то нужно оставить только имя метода.
//     public static person createPerson(String name, int age)
    public person(String name, int age) {
//        return и person не нужны. Мы должны сослаться на "String name" и "int age" с помощью this
//        person pers = new person();
//        pers.name = name;
//        pers.age = age;
//        return pers;
        this.name =name;
        this.age = age;
    }

    //    не понятно зачема но надо
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
