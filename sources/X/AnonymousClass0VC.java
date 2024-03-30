package X;

import android.app.Notification;
import android.app.Person;

/* renamed from: X.0VC  reason: invalid class name */
public abstract class AnonymousClass0VC {
    public static Notification.MessagingStyle A00(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static void A01(Notification.MessagingStyle messagingStyle, boolean z) {
        messagingStyle.setGroupConversation(z);
    }
}
