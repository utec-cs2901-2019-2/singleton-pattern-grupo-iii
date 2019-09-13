public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  // Singleton
  private static ChocolateBoiler instance;

  public static ChocolateBoiler getInstance() {
    if (instance == null) {
      instance = new ChocolateBoiler();
    }
    return instance;
  }

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }

  public void drain() {
    if (isEmpty() && isBoiled()) {
      // drain the boiled milk and chocolate
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && isBoiled()) {
      // bring the contents to a boil
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
