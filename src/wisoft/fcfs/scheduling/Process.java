package wisoft.fcfs.scheduling;
// TODO Process Information
public class Process {
  private final String name;
  private final int bustTime;
  private final int priority;
  private final int turnAroundTime;
  private int waitTime;

  // TODO 실수로 값의 변경을 막아주어 실수를 막을 수 있다.

  public Process(final String name, final int bustTime, final int priority, final int turnAroundTime) {
    this.name = name;
    this.bustTime = bustTime;
    this.priority = priority;
    this.turnAroundTime = turnAroundTime;

  }

  public Process(final String name, final int bustTime, final int turnAroundTime) {
    this.name = name;
    this.bustTime = bustTime;
    this.turnAroundTime = turnAroundTime;
    this.priority = 0;
  }

  public void setWaitTime(int waitTime) {
    this.waitTime = waitTime;
  }

  public String getName() {
    return name;
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
