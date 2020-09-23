public class LinkedList<T> implements Aggregate<T> {
  private Node<T> head;

  public LinkedList() {
    this.head = null;
  }

  public void push(T value) {
    this.head = new Node<>(value, this.head);
  }

  public Iterator<T> createIterator() {
    return new ListIterator<T>(this.head);
  }

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
    }
  }

  private static class ListIterator<T> implements Iterator<T> {
    // Estado do iterador!
    private Node<T> node;

    ListIterator(Node<T> node) {
      this.node = node;
    }

    public T next() {
      if(node != null) {
        T result = node.value;
        this.node = node.next;
        return result;
      }

      // O certo seria jogar uma exception, mas...
      return null;
    }

    public boolean hasNext() {
      return this.node != null;
    }
  }
}
