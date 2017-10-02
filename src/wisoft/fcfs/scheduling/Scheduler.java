package wisoft.fcfs.scheduling;

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
