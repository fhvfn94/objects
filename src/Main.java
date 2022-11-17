public class Main {
    public static String[] strDelenie(String a) {
        String[] r = new String[2];
        if (a.length() % 2 == 0) {
            r[0] = a.substring(0, a.length() / 2);
            r[1] = a.substring(a.length() / 2);
        } else {
            r[0] = a.substring(0, a.length() / 2);
            r[1] = a.substring(a.length() / 2 + 1);
        }
        return r;
    }
    public static void main(String[] args) {
        //Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        String a = "abvg";
        String[] srtDelenie = strDelenie(a);
        System.out.println(srtDelenie[0] + "/" + srtDelenie[1]);

    }
}