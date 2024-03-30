package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0ZX  reason: invalid class name */
public class AnonymousClass0ZX implements Handler.Callback {
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((AnonymousClass6YL) message.obj).A0Q();
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ((AnonymousClass6YL) message.obj).A0T(message.arg1);
            return true;
        }
    }
}
