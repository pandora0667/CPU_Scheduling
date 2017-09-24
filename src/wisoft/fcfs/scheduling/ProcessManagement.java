package wisoft.fcfs.scheduling;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class ProcessManagement {
  private LinkedList<Process> processes;
  private Random random;
  private int turnAroundTime;

  public ProcessManagement() {
    this.processes = new LinkedList<>();
    this.random = new Random();
    this.turnAroundTime = 0;
  }

  public boolean init(final int processesNumber) {
    IntStream.range(0, processesNumber)
        .forEach(i -> processes.add(generateProcessInformation()));

    processes.getFirst().setTurnAroundTime(processes.getFirst().getBustTime());

    for (int i=1; i<processes.size(); i++) {
      turnAroundTime += processes.get(i-1).getBustTime();
      processes.get(i).setTurnAroundTime(turnAroundTime + processes.get(i).getBustTime());
    }
    return !processes.isEmpty();
  }

  public LinkedList<Process> confirm() {
    if (processes.isEmpty()) return null;
    return processes;
  }

  private Process generateProcessInformation() {
    final String work = Declarations.processWork.get(random.nextInt(10));
    final int bustTime = random.nextInt(10)+1;
    final int priority = random.nextInt(3);

    return new Process(work, bustTime, priority);
  }
  // TODO 랜덤 프로세스 생성
}
