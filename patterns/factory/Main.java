public class Main {
  // Fazendo o nosso papel de director
  public static final void main(String... args) {
    // Constrói uma implementação concreta de um factory
    WidgetFactory factory = new WidgetFactoryImpl();

    //
    Window window = factory
                      .newWindow()
                      .build();
    Button button = factory
                      .newButton(window)
                      .setColor(0xFF0000)
                      .build();

    // Vamos verificar o resultado
    System.out.println(button);
    System.out.println(button.getParent());
    System.out.println(button.getParent().getParent());

    // Verifica as cores definidas na interface fluente
    System.out.println(Integer.toHexString(window.getColor()));
    System.out.println(Integer.toHexString(button.getColor()));
  }
}
