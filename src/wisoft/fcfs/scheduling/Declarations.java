package wisoft.fcfs.scheduling;
import java.util.HashMap;
import java.util.LinkedList;

public class Declarations {
  static final int NEW_PROCESS = 1;
  static final int PROCESS_LIST = 2;
  static final int SCHEDULING = 3;
  static final int PROGRESS = 4;
  static final int CHECK_RESULT = 5;
  static final int EXIT = 0;

  static final int FCFS = 1;
  static final int SJF = 2;
  static final int ROUND_ROBIN = 3;
  static final int PRIORITY_SCHEDULING = 4;
  static final int LSW_SCHEDULING = 5;

  // 프로세스 작업이름 저장
  static final HashMap<Integer, String> processWork = new HashMap<>();

  static void clearScreen() {
    for (int i=0; i<20; i++) {
      System.out.println("");
    }
  }

  // TODO process 공용변수????, 이게 맞는 방향인가?
  protected static LinkedList<Process> processes = new LinkedList<>();

  static synchronized void setProcess(final Process process) {
    processes.add(process);
  }

//  static synchronized Process getProcess() {
//    if (!processes.isEmpty())
//      return processes.poll();
//
//    return null;
//  }

  static synchronized void setProcessList(LinkedList<Process> processList) {
    processes = processList;
  }

  static synchronized LinkedList<Process> getProcessesList() {
    if (!processes.isEmpty())
      return processes;

    return null;
  }
}
