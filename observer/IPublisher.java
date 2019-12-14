public interface IPublisher {
    public void subscribe(ISubscriber s);
    public void unsubscribe(ISubscriber s);
    public void send();

}

