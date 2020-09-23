public class Wheel implements Element {
  private String name;

  public Wheel(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void accept(Visitor v) {
    v.visitWheel(this);
  }
}
