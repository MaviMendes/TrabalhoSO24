public class ConsoleNotifier implements NotificationInterface {
    @Override
    public void display(String info) {
        System.out.println(info);
    }
}
