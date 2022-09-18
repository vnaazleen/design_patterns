public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // notifies observers whenever the subject's state changes
}