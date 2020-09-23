public abstract class AbstractWidget implements Widget {
  private int color = 0xFFFFFF;
  private Widget parent = null;

  public Widget getParent() {
    return this.parent;
  }

  public void setParent(Widget parent) {
    this.parent = parent;
  }

  public int getColor() {
    return this.color;
  }

  public void setColor(int color) {
    this.color = color;
  }
}
