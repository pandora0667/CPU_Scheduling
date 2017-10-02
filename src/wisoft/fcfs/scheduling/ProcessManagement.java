package wisoft.fcfs.scheduling;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class ProcessManagement {

  public ProcessManagement() {
  }

  public boolean init(final int processesNumber) {
    IntStream.range(0, processesNumber)
        .forEach(i -> Declarations.setProcess(generateProcessInformation()));

    try { //TODO FCFS에만 적용되는 일
      LinkedList<Process> tmpProcesses = Declarations.getProcessesList();
      if (tmpProcesses == null) throw new Exception();
      tmpProcesses.getFirst().setTurnAroundTime(tmpProcesses.getFirst().getBurstTime());

      int turnAroundTime = 0;  // totalTime
      for (int i = 1; i < tmpProcesses.size(); i++) {  // 한번 초기화 되어있어도 처음부터 처리함. 비효율적임.
        turnAroundTime += tmpProcesses.get(i - 1).getBurstTime();
        tmpProcesses.get(i).setTurnAroundTime(turnAroundTime + tmpProcesses.get(i).getBurstTime());
      }
      Declarations.setProcessList(tmpProcesses);
    } catch (Exception e) {
      System.out.println("프로세스가 정상적으로 생성되지 않아 처리할 수 없습니다.");
    }

    return !Declarations.processes.isEmpty(); //TODO 이부분이 조금 이상함.
  }

  private Process generateProcessInformation() {
    Random random = new Random();
    final String work = Declarations.processWork.get(random.nextInt(10));
    final int bustTime = random.nextInt(10) + 1;
    final int priority = random.nextInt(3);

    return new Process(work, bustTime, priority);
  }
  // TODO 랜덤 프로세스 생성
}
