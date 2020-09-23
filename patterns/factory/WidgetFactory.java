/**
 * Implementa uma estratégia para criações de uma certa hierarquia de objetos.
 */
public abstract class WidgetFactory {
  // Utilizamos uma interface fluente para auxiliar na construção dos objetos
  public abstract FluentWidget<Window> newWindow();
  public abstract FluentWidget<Button> newButton(Widget parent);
}
