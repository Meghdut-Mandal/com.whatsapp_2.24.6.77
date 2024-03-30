package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4ZL  reason: invalid class name */
public class AnonymousClass4ZL implements AnonymousClass4QT {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BM4() {
        AnonymousClass6YP r0;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                return !((C70803fk) obj).A2a();
            case 1:
                r0 = ((PopupNotification) obj).A1G;
                break;
            default:
                r0 = ((MessageReplyActivity) obj).A1E;
                break;
        }
        if (r0 == null || r0.A0H == null) {
            return true;
        }
        return false;
    }
}
