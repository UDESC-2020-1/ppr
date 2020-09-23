// Vamos usar algumas classes padrões
import java.util.Stack;
import static java.util.AbstractMap.SimpleEntry;

public class Tree<T extends Comparable<T>> implements Aggregate<T> {
  private Node<T> root;

  public Tree() {
    this.root = null;
  }

  public void insert(T value) {
    if(this.root == null) {
      this.root = new Node<T>(value);
    } else {
      this.root.insert(value);
    }
  }

  public Iterator<T> createIterator() {
    return this.createInOrderIterator();
  }

  public Iterator<T> createPreOrderIterator() {
    return new PreOrderIterator();
  }

  public Iterator<T> createInOrderIterator() {
    return new InOrderIterator();
  }

  public Iterator<T> createPostOrderIterator() {
    return new PostOrderIterator();
  }

  private static class Node<T extends Comparable<T>> {
    T value;
    Node<T> left = null;
    Node<T> right = null;

    Node(T value) {
      this.value = value;
    }

    void insert(T value) {
      int val = this.value.compareTo(value);

      if(val > 0) {
        if(this.left == null) {
          this.left = new Node<>(value);
        } else {
          this.left.insert(value);
        }
      } else if(val < 0) {
        if(this.right == null) {
          this.right = new Node<>(value);
        } else {
          this.right.insert(value);
        }
      }
    }
  }

  private abstract class TreeIterator implements Iterator<T> {
    Stack<SimpleEntry<Boolean, Node<T>>> pending;

    TreeIterator() {
      this.pending = new Stack<>();
      this.push(false, Tree.this.root);
    }

    public boolean hasNext() {
      return !this.pending.empty();
    }

    void push(boolean isValue, Node<T> node) {
      if(node != null) {
        this.pending.push(new SimpleEntry<>(isValue, node));
      }
    }

    public T next() {
      SimpleEntry<Boolean, Node<T>> entry = this.pending.pop();
      Node<T> node = entry.getValue();

      // Desejamos informar o valor?
      if(entry.getKey()) {
        return node.value;
      } else {
        this.process(node);
        return next();
      }
    }

    abstract protected void process(Node<T> node);
  }

  private class PreOrderIterator extends TreeIterator {
    protected void process(Node<T> node) {
      this.push(false, node.right);
      this.push(false, node.left);
      this.push(true, node);
    }
  }

  private class InOrderIterator extends TreeIterator {
    protected void process(Node<T> node) {
      this.push(false, node.right);
      this.push(true, node);
      this.push(false, node.left);
    }
  }

  private class PostOrderIterator extends TreeIterator {
    protected void process(Node<T> node) {
      this.push(true, node);
      this.push(false, node.right);
      this.push(false, node.left);
    }
  }
}
