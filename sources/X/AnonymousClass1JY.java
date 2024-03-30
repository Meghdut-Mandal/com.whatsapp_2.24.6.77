package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1JY  reason: invalid class name */
public class AnonymousClass1JY extends Handler {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void handleMessage(Message message) {
        if (!((AnonymousClass1G4) this.A01.get()).A01()) {
            AnonymousClass1YV.A02((AnonymousClass1YV) this.A00.get(), true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JY(Looper looper, AnonymousClass005 r2, AnonymousClass005 r3) {
        super(looper);
        C18740tg.A06(looper);
        this.A00 = r2;
        this.A01 = r3;
    }
}
