package wisoft.fcfs.scheduling;
// TODO Process Information
public class Process {
  private final String work;
  private final int bustTime;
  private final int priority;
  private int turnAroundTime;
  private int waitTime;

  // TODO 실수로 값의 변경을 막아주어 실수를 막을 수 있다.

  public Process(final String work, final int bustTime, final int priority) {
    this.work = work;
    this.bustTime = bustTime;
    this.priority = priority;
    this.turnAroundTime = 0;
    this.waitTime = 0;
  }

  public void setWaitTime(final int waitTime) {
    this.waitTime = waitTime;
  }

  public void setTurnAroundTime(final int turnAroundTime) {
    this.turnAroundTime = turnAroundTime;
  }

  public String getWork() {
    return work;
  }

  public int getBustTime() {
    return bustTime;
  }

  public int getTurnAroundTime() {
    return turnAroundTime;
  }

  public int getWaitTime() {
    return waitTime;
  }

  public int getPriority() {
    return priority;
  }
}
