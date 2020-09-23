public class FluentWidget<T extends Widget> {
  private T widget;

  public FluentWidget(T widget) {
    this.widget = widget;
  }

  public FluentWidget<T> setColor(int color) {
    this.widget.setColor(color);
    return this;
  }

  public T build() {
    return widget;
  }
}
