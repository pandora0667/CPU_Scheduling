package wisoft.fcfs.scheduling;

import java.util.LinkedList;

public class Kernel {
  private ProcessManagement processManagement;
  private CPU cpu;
  private Scheduler scheduler;

  public Kernel() {
    processManagement = new ProcessManagement();
    workInit();
  }

  public boolean create(final int processesNumber) {
    return processManagement.init(processesNumber);

  }

  public LinkedList<Process> confirm() {
    return processManagement.confirm();
  }

  private void workInit() {
    Declarations.processWork.put(0, "카카오톡");
    Declarations.processWork.put(1, "크롬");
    Declarations.processWork.put(2, "한글 2017");
    Declarations.processWork.put(3, "InteliJ");
    Declarations.processWork.put(4, "DataGrip");
    Declarations.processWork.put(5, "파워포인트");
    Declarations.processWork.put(6, "멜론");
    Declarations.processWork.put(7, "앱스토어");
    Declarations.processWork.put(8, "벅스 플레이어");
    Declarations.processWork.put(9, "Telegram");
  }
}
