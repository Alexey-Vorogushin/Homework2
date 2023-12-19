public class Main {
    public static void main(String[] args) {
        var hour = 640;
        var timeWorker = 8;
        var result = hour / timeWorker;
        System.out.println("Всего работников в компании - " + result + " человек");
        result = result + 94;
        var resultTwo = hour / result;
        System.out.println("Если в компании работает " + result + " человек, то всего " + resultTwo + " часов работы может быть поделено между сотрудниками.");

    }
}