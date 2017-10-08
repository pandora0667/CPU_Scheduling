package wisoft.fcfs.scheduling;

import java.util.LinkedList;

import static wisoft.fcfs.scheduling.Declarations.*;


public class Scheduler {
  private Runnable runnable;

  public Scheduler() {
  }

  public void execution(int kinds) {
    // todo 스케줄러가 종료될때까지 스케줄러 실행 금지 trun변수나 등등...
    switch (kinds) {
      case FCFS:
        runnable = Scheduler::fcfsScheduler;
        new Thread(runnable).start();
        break;
      case SJF:
        runnable = Scheduler::sjfScheduler;
        new Thread(runnable).start();
        break;
      case ROUND_ROBIN:
        runnable = Scheduler::RRScheduler;
        new Thread(runnable).start();
        break;
      case PRIORITY_SCHEDULING:
        runnable = Scheduler::priorityScheduler;
        new Thread(runnable).start();
        break;
      case LSW_SCHEDULING:
        runnable = Scheduler::lswScheduler;
        new Thread(runnable).start();
        return;
      default:
        System.out.println("해당하는 메뉴가 없습니다.");
    }
  }

  private static void fcfsScheduler() {
    try {
      //TODO 스케줄러 적용 Thread 적용할 필요가 없음.....
      LinkedList<Process> tmpProcesses = Declarations.getProcessesList();
      if (tmpProcesses == null) throw new Exception();
      tmpProcesses.getFirst().setTurnAroundTime(tmpProcesses.getFirst().getBurstTime());

      int totalTime = 0;  // totalTime
      for (int i = 1; i < tmpProcesses.size(); i++) {  // 한번 초기화 되어있어도 처음부터 처리함. 비효율적임.
        totalTime += tmpProcesses.get(i - 1).getBurstTime();
        tmpProcesses.get(i).setTurnAroundTime(totalTime + tmpProcesses.get(i).getBurstTime());
      }
      Declarations.setProcessList(tmpProcesses);
    } catch (Exception e) {
      System.out.println("프로세스가 정상적으로 생성되지 않아 처리할 수 없습니다.");
    }
  }

  private static void sjfScheduler() {
  }

  private static void RRScheduler() {
  }

  private static void priorityScheduler() {
  }

  private static void lswScheduler() {
  }
}
