package wisoft.fcfs.scheduling;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO Final 변수 사용하기
// TODO GANTT CHART
// TODO Average Time
// TODO Average Turn Around Time

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("    —------—  CPU 'First In First Out' Scheduling in JAVA  —--------");
    boolean run = true;

    while (run) {
      System.out.println("| 1.새로운 프로세스 입력 | 2. 프로세스 리스트 확인 | 3. 스케줄링 | 4. 진행상황 | 5. 결과확인 | 0. EXIT");

      try {
        int input = scanner.nextInt();

        switch (input) {
          case Selector.NEW_PROCESS:
            Process process  = new Process("P1", 1, 1, 1);
            System.out.println(process.getBustTime());
            break;
          case Selector.PROCESS_LIST:
            break;
          case Selector.SCHEDULING:
            SchedulingKinds();
            break;
          case Selector.PROGRESS:
            break;
          case Selector.CHECK_RESULT:
            break;
          case Selector.EXIT:
            run = false;
            break;
          default:
            System.out.println("해당하는 메뉴가 없습니다.");
        }
      } catch (InputMismatchException error) {
        System.out.println("올바르지 않은 형식이 입력되었습니다.");
      }
    }
  }

  private static void SchedulingKinds() {

    try {
      int input = scanner.nextInt();

      switch (input) {
        case Selector.FCFS:
          break;
        case Selector.SJF:
          System.out.println("현재 구성중입니다");
          break;
        case Selector.ROUND_ROBIN:
          System.out.println("현재 구성중입니다");
          break;
        case Selector.PRIORITY_SCHEDULING:
          System.out.println("현재 구성중입니다");
          break;
        case Selector.LSW_SCHEDULING:
          System.out.println("현재 구성중입니다");
          return;
        case Selector.EXIT:
          return;
        default:
          System.out.println("해당하는 메뉴가 없습니다.");
      }
    } catch (InputMismatchException error) {
      System.out.println("올바르지 않은 형식이 입력되었습니다.");
    }
  }
}
