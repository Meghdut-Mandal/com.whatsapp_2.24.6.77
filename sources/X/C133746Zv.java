package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.6Zv  reason: invalid class name and case insensitive filesystem */
public final class C133746Zv implements Handler.Callback {
    public final Handler.Callback A00;

    public boolean handleMessage(Message message) {
        String str;
        AnonymousClass00C.A0D(message, 0);
        Object obj = message.obj;
        if (obj instanceof C114545hQ) {
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((C114545hQ) obj).A00;
            AnonymousClass6RN.A00(str);
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                AnonymousClass68E.A00();
            }
        }
    }

    public C133746Zv(Handler.Callback callback) {
        this.A00 = callback;
    }
}
