public class Main {
  public static final void main(String... args) {
    Singleton x = Singleton.getInstance();
    Singleton y = Singleton.getInstance();

    System.out.println(x);
    System.out.println(y);

    // Verifica que realmente recebemos o mesmo objeto
    System.out.println(x == y);
  }
}
