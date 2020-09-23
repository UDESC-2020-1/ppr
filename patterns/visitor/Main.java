public class Main {
  public static final void main(String... args) {
    Car car = new Car();

    Visitor v = new TestVisitor();

    car.accept(v);

    Engine engine = new Engine();

    engine.accept(v);
  }

  private static class TestVisitor implements Visitor {
    public void visitCar(Car c) {
      System.out.println("Visitando um carro!");
    }
    public void visitEngine(Engine e) {
      System.out.println("Visitando um motor!");
    }
    public void visitWheel(Wheel w) {
      System.out.println("Visitando a roda: " + w.getName());
    }
  }
}
