package wisoft.fcfs.scheduling;

public class Process {
  private String name;
  private int bustTime;
  private int arrivedTime ;

  public Process(String name, int bustTime, int arrivedTime) {
    this.name = name;
    this.bustTime = (bustTime);
    this.arrivedTime = (arrivedTime);
  }

  public String getName() {
    return name;
  }

  public int getBustTime() {
    return bustTime;
  }

  public int getArrivedTime() {
    return arrivedTime;
  }
}
