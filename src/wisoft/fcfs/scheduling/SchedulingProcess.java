package wisoft.fcfs.scheduling;

import java.util.*;

public class SchedulingProcess {
  private LinkedList<Process> readyQueue;

  public SchedulingProcess() {
    readyQueue = new LinkedList<>();
  }

  public void create(String name, int bustTime) {
    //readyQueue.add(new Process(name, bustTime));
  }

  private void running() { // TODO Thread implement
    Runnable runnable = this::scheduling;
    new Thread(runnable).start();
  }

  private void scheduling() {

  }
}

