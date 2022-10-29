public class Main {
//   TODO: Первый способ
//    Я создал метод свреху что бы можно было с помощью него объявлять новые переменные name и age
//    public static person createPerson(String name, int age) {
//        person pers = new person();
//        pers.name = name;
//        pers.age = age;
//        return pers;
//    }
    public static void main(String[] args) {
//        TODO: "createPerson" выдает ошибку так как мы меренесли метод createPerson из класса MAIN в класс person
//         person sarah = createPerson("sarah", 30);
//         person john = createPerson("John", 13);

//        Todo: что бы все работало нам необходимо явно указать на какой класс мы ссылаемся.
//         person john = person.createPerson("John", 13);

//        Todo: делаем конструктор:
        person john = new person("john", 30);
        System.out.println("john.getAge() = " + john.getAge());
//        System.out.println("john.name = " + john.name);
//        System.out.println("john.age = " + john.age);
        person sarah = new person("Sarah", 13);
        System.out.println("sarah.getName() = " + sarah.getName());
//        System.out.println("sarah.name = " + sarah.name);

    }
}