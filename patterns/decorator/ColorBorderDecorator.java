public class ColorBorderDecorator extends ComponentDecorator {

  int color;

  public ColorBorderDecorator(Component component, int color) {
    super(component);
    this.color = color;
  }

  void beforeDraw() {
    System.out.println("ColorBorderDecorator::beforeDraw() (color = " +
      this.color + ")");
    setBorderColor(this.color);
  }

  void afterDraw() {
    System.out.println("ColorBorderDecorator::afterDraw()");
  }

}
