package wisoft.fcfs.scheduling;

import java.util.*;

public class Scheduling {
  private Queue<Process> readyQueue;
  private List<Process> newProcess;

  public Scheduling() {
    newProcess = new ArrayList<>();
    readyQueue = new LinkedList<>();
  }

  public void create(String name, int bustTime, int arrivedTime) {
    newProcess.add(new Process(name, bustTime, arrivedTime));
  }

  public void init() {
    MiniComparator comp = new MiniComparator();
    newProcess.sort(comp);
    readyQueue.addAll(newProcess);
  }

  public void running() {
    for (int i=newProcess.size()-1; i>= 0; i--) {
      log("");
      Process process = newProcess.get(i);
      log(process.getName() + " 프로세스 작업을 시작합니다.");
      log("   --- " + process.getName() + " 프로세스의 Bust Time은 " + process.getBustTime() + "초 입니다. ---");
      try {
        Thread.sleep((process.getBustTime() * 1000));
      } catch (InterruptedException e) {}

      log(process.getName() + " 프로세스의 작업이 끝났습니다.");
    }
  }

  private void log(String str) {
    System.out.println(str);
  }
}

class MiniComparator implements Comparator<Process> {
  @Override
  public int compare(Process first, Process second) {
    int firstValue = first.getArrivedTime();
    int secondValue = second.getArrivedTime();

    // Order by descending
    return Integer.compare(secondValue, firstValue);
  }
}