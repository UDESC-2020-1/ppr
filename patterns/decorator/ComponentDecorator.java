public abstract class ComponentDecorator extends Component {
  protected Component component;

  abstract void beforeDraw();
  abstract void afterDraw();

  public ComponentDecorator(Component component) {
    this.component = component;
  }

  public final void draw() {
    beforeDraw();
    this.component.draw();
    afterDraw();
  }
}
