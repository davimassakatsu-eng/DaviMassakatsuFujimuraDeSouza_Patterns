public class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("A factory não pode ser nula.");
        }
        this.factory = factory;
    }

    public void notify(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
