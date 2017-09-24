package wisoft.fcfs.scheduling;

import java.util.LinkedList;

public class Kernel {
  private ProcessManagement processManagement;

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

  public void executionScheduling(final int kinds) {
    System.out.println("처리중입니다.");


    switch (kinds) {
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

  }

  private void workInit() {
    Declarations.processWork.put(0, "카카오톡");
    Declarations.processWork.put(1, "크롬");
    Declarations.processWork.put(2, "한글 2017");
    Declarations.processWork.put(3, "IntelliJ");
    Declarations.processWork.put(4, "DataGrip");
    Declarations.processWork.put(5, "파워포인트");
    Declarations.processWork.put(6, "멜론");
    Declarations.processWork.put(7, "앱스토어");
    Declarations.processWork.put(8, "벅스 플레이어");
    Declarations.processWork.put(9, "Telegram");
  }
}
