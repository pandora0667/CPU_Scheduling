package wisoft.fcfs.scheduling;
import java.util.HashMap;



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
}
