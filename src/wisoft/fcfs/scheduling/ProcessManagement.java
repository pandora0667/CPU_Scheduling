package wisoft.fcfs.scheduling;

import java.util.Random;
import java.util.stream.IntStream;
import static wisoft.fcfs.scheduling.Declarations.*;

public class ProcessManagement {
  private Random random;
  public ProcessManagement() {
    random = new Random();
  }

  public boolean init(final int processesNumber) {
    IntStream.range(0, processesNumber)
        .forEach(i -> setProcess(generateProcessInformation()));

    return processesIsEmpty();
  }

  private Process generateProcessInformation() {
    final String work =  processWork.get(random.nextInt(10));
    final int bustTime = random.nextInt(10) + 1;
    final int priority = random.nextInt(3);

    return new Process(work, bustTime, priority);
  }
  // TODO 랜덤 프로세스 생성
}
