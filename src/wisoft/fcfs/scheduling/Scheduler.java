package wisoft.fcfs.scheduling;

public class Scheduler {
  private Runnable runnable;

  public Scheduler() {
  }

  public void execution(int kinds) {

    switch (kinds) {
      case Declarations.FCFS:
        runnable = Scheduler::fcfsScheduler;
        new Thread(runnable).start();
        break;
      case Declarations.SJF:
        runnable = Scheduler::sjfScheduler;
        new Thread(runnable).start();
        break;
      case Declarations.ROUND_ROBIN:
        runnable = Scheduler::RRScheduler;
        new Thread(runnable).start();
        break;
      case Declarations.PRIORITY_SCHEDULING:
        runnable = Scheduler::priorityScheduler;
        new Thread(runnable).start();
        break;
      case Declarations.LSW_SCHEDULING:
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
