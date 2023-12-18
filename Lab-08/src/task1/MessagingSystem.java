package task1;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(permissionLevel = 1)
    public void sendMessage(Admin user, String message) {
        System.out.println("Message sent by user " + user.getUsername() + ": " + message);
    }

    public void sendMessage(User user, String message) {
        System.out.println("no access");
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Faris");
        Admin privilegedUser = new Admin ("Fare");

        messagingSystem.sendMessage(regularUser, "selam!");
        messagingSystem.sendMessage(privilegedUser, "eeeeeeee");
    }
}
