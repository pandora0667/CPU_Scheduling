package wisoft.fcfs.scheduling;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

// TODO Final 변수 사용하기
// TODO GANTT CHART
// TODO Average Time
// TODO Average Turn Around Time

public class Main {
  private static final Scanner scanner = new Scanner(System.in);
  private static final Kernel kernel = new Kernel();

  public static void main(String[] args) {
    System.out.println("    —------—  CPU Scheduling implementation in JAVA  —--------");
    boolean run = true;

    while (run) {
      System.out.println("\n| 1.새로운 프로세스 입력 | 2. 프로세스 리스트 확인 | 3. 스케줄링 | 4. 진행상황 | 5. 결과확인 | 0. EXIT");

      try {
        final int input = scanner.nextInt();
        switch (input) {

          case Declarations.NEW_PROCESS:
            Declarations.clearScreen();
            System.out.println("몇개의 프로세스를 생성할 것인가요?");
            final int processesNumber = scanner.nextInt();
            if (kernel.create(processesNumber)) {
              System.out.println("성공적으로 생성되었습니다.");
            }
            break;

          case Declarations.PROCESS_LIST:
            Declarations.clearScreen();
            LinkedList<Process> list = kernel.confirm();
            if (list != null) {
              for (Process process : list)
                System.out.println(process.getWork() +", bustTime : "+ process.getBustTime() +",  turnAroundTime : " + process.getTurnAroundTime());
              break;
            }
            System.out.println("큐에 생성된 프로세스 리스트가 없습니다.");
            break;

          case Declarations.SCHEDULING:
            SchedulingKinds();
            break;

          case Declarations.PROGRESS:
            break;

          case Declarations.CHECK_RESULT:
            break;

          case Declarations.EXIT:
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
      Declarations.clearScreen();
      System.out.println("| 1. FCFS | 2. SJF | 3. ROUND_ROBIN | 4. PRIORITY_SCHEDULING | 5. LSW_SCHEDULING | 0. EXIT |");
      final int kinds = scanner.nextInt();

      if (kinds >= Declarations.FCFS && kinds <= Declarations.LSW_SCHEDULING)
        kernel.executionScheduling(kinds);

    } catch (InputMismatchException error) {
      System.out.println("올바르지 않은 형식이 입력되었습니다.");
    }
  }
}
