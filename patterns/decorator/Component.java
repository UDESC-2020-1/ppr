public abstract class Component {
  //
  public abstract void draw();

  //
  public void fill() {
    System.out.println("Component::fill()");
  };
  public void setColor(int color) {
    System.out.println("Component::setColor(" + color + ")");
  };
  public void setBorderColor(int color) {
    System.out.println("Component::setBorderColor(" + color + ")");
  };
}
