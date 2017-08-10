package wisoft.fcfs.scheduling;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("    —------—  CPU 'First In First Out' Scheduling in JAVA  —--------");
    Scheduling scheduling = new Scheduling();
    System.out.println("How many processes do you create?");
    int total = scanner.nextInt();

    // Process ID, Burst Time, Arrival Time
    for (int i=0; i<total; i++) {
      System.out.println("Enter Process-ID, bust-time, arrived-time please..");
      String name = scanner.next();
      int bust = scanner.nextInt();
      int arrived = scanner.nextInt();
      scheduling.create(name, bust, arrived);
    }
    scheduling.init();
    scheduling.running();

    // GANTT CHART
    // Average Time
    // Average Turn Around Time
  }
}