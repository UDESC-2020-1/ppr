public class Main {
  public static final void main(String... args) {
    Component c = new ColorBorderDecorator(new Circle(), 0xFF0000);
    c.draw();
  }
}
