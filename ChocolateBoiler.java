public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  // Singleton
  private static volatile ChocolateBoiler instance;
  private static final Object mutex = new Object();

  public static synchronized ChocolateBoiler getInstance() {
    ChocolateBoiler tmp = instance;
    if (instance == null) {
        synchronized(mutex){
            tmp = instance;
            if(tmp == null){
                tmp = new ChocolateBoiler();
                instance = tmp;
            }
        }
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
