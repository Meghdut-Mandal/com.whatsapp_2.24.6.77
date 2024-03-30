package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1ln  reason: invalid class name and case insensitive filesystem */
public class C37091ln extends Handler {
    public final /* synthetic */ AnonymousClass1Q0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37091ln(Looper looper, AnonymousClass1Q0 r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        this.A00.A01();
    }
}
