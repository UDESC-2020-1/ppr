public class WidgetFactoryImpl extends WidgetFactory {
  public FluentWidget<Window> newWindow() {
    Window window = new Window();
    window.setParent(null);

    return new FluentWidget<Window>(window);
  }

  public FluentWidget<Button> newButton(Widget parent) {
    Button button = new Button();
    button.setParent(parent);

    return new FluentWidget<Button>(button);
  }
}
