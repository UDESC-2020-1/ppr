public class Car implements Element {
  private Engine engine;
  private Wheel wheel[];

  public Car() {
    this.engine = new Engine();
    this.wheel = new Wheel[4];
    this.wheel[0] = new Wheel("Dianteira esquerda");
    this.wheel[1] = new Wheel("Dianteira direita");
    this.wheel[2] = new Wheel("Traseira esquerda");
    this.wheel[3] = new Wheel("Traseira direita");
  }

  public void accept(Visitor v) {
    v.visitCar(this);
    this.engine.accept(v);
    for(Wheel w: this.wheel) {
      w.accept(v);
    }
  }
}
