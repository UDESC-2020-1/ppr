public class Singleton {
  // - instance: Singleton[0..1]
  private static Singleton instance = null;

  // - <<create>> Singleton()
  private Singleton() {
    return;
  }

  // + getInstance()
  public static Singleton getInstance() {
    // Cria uma nova instância, se necessário, e retorna ela!
    if(Singleton.instance == null) {
      // Garante que duas threads não vão cair aqui ao mesmo tempo!
      synchronized(Singleton.class) {
        // Se outra thread já não tiver criado...
        if(Singleton.instance == null) {
          // Finalmente, agora criamos o objeto :)
          Singleton.instance = new Singleton();
        }
      }
    }

    // Retorna o objeto instanciado!
    return Singleton.instance;
  }
}
