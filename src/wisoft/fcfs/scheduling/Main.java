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

  public static void main(String[] args) {
    Kernel kernel = new Kernel();
    System.out.println("    —------—  CPU  Scheduling implementation in JAVA  —--------");
    boolean run = true;

    while (run) {
      System.out.println("| 1.새로운 프로세스 입력 | 2. 프로세스 리스트 확인 | 3. 스케줄링 | 4. 진행상황 | 5. 결과확인 | 0. EXIT");

      try {
        int input = scanner.nextInt();
        switch (input) {
          case Declarations.NEW_PROCESS:
            System.out.println("몇개의 프로세스를 생성할 것인가요?");
            final int processesNumber = scanner.nextInt();
            if (kernel.create(processesNumber)) {
              System.out.println("성공적으로 생성되었습니다.");
            }
            break;
          case Declarations.PROCESS_LIST:
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
      int input = scanner.nextInt();

      switch (input) {
        case Declarations.FCFS:
          break;
        case Declarations.SJF:
          System.out.println("현재 구성중입니다");
          break;
        case Declarations.ROUND_ROBIN:
          System.out.println("현재 구성중입니다");
          break;
        case Declarations.PRIORITY_SCHEDULING:
          System.out.println("현재 구성중입니다");
          break;
        case Declarations.LSW_SCHEDULING:
          System.out.println("현재 구성중입니다");
          return;
        case Declarations.EXIT:
          return;
        default:
          System.out.println("해당하는 메뉴가 없습니다.");
      }
    } catch (InputMismatchException error) {
      System.out.println("올바르지 않은 형식이 입력되었습니다.");
    }
  }
}
