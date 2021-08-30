import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totaltime = 0;
        int biggestTime = 0;
        int smallestTime = 0;

        while (true) {
            System.out.println("Название проекта: ");
            String title = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение: ");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов потребуется на выполнение");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут потребуется на выполнение");
            int minutes = Integer.parseInt(scanner.nextLine());
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totaltime += currentTimeTask;
            if (currentTimeTask > biggestTime) {
                System.out.println(currentTimeTask + biggestTime);
            } else if (currentTimeTask < smallestTime) {
                System.out.println(currentTimeTask + smallestTime);
            }
            System.out.println("Для завершение работы введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                System.out.println("Вы не правильно написали 'end' ");
            }
        }
        System.out.println("Всего потребуется " + totaltime + " секунд");
    }


    public static int convertToSeconds(int days, int hours, int minutes) {
        int secound;
        secound = days * 86400 + hours * 3600 + minutes * 60;
        return secound;
    }
}
