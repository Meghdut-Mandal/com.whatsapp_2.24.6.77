package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4cK  reason: invalid class name and case insensitive filesystem */
public final class C91614cK extends Handler {
    public final /* synthetic */ C133146Wy A00;

    public void handleMessage(Message message) {
        AnonymousClass00C.A0D(message, 0);
        int i = message.what;
        if (i == 99) {
            C133146Wy.A00(this.A00);
            return;
        }
        throw C90514aH.A0s(AnonymousClass000.A0r("Unknown message: ", AnonymousClass000.A0u(), i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91614cK(Looper looper, C133146Wy r2) {
        super(looper);
        this.A00 = r2;
    }
}
