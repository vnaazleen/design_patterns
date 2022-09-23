public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  
  public static ChocolateBoiler uniqueChocolateBoiler;
  
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
  
  public static synchronized ChocolateBoiler getInstance() {
    if (uniqueChocolateBoiler == null) {
      uniqueChocolateBoiler = new ChocolateBoiler();
    }
    
    return uniqueChocolateBoiler;
  }
  
  public void fill() {
     if (isEmpty()) {
       empty = false;
       boiled = false;
       // fill the boiler with a milk/chocolate mixture
     }
   }
  
   public void drain() {
     if (!isEmpty() && isBoiled()) {
       // drain the boiled milk and chocolate
       empty = true;
     }
   }
  
   public void boil() {
     if (!isEmpty() && !isBoiled()) {
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
