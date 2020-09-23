public class Main {
  public static final void main(String... args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.push(10);
    list.push(20);
    list.push(30);

    showAllValues(list.createIterator());

    Tree<Integer> tree = new Tree<Integer>();

    tree.insert(40);
    tree.insert(20);
    tree.insert(60);
    tree.insert(10);
    tree.insert(30);
    tree.insert(50);
    tree.insert(70);

    showAllValues(tree.createPreOrderIterator());
    showAllValues(tree.createInOrderIterator());
    showAllValues(tree.createPostOrderIterator());
  }

  public static void showAllValues(Iterator<Integer> it) {
    System.out.println("Começando a iteração...");
    while(it.hasNext()) {
      Integer i = it.next();
      System.out.println("  Próximo elemento: " + i);
    }
  }
}
