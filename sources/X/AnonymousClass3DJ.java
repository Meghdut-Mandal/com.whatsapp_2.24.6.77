package X;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* renamed from: X.3DJ  reason: invalid class name */
public class AnonymousClass3DJ {
    public final /* synthetic */ AnonymousClass174 A00;
    public final /* synthetic */ C226715i A01;

    public AnonymousClass3DJ(AnonymousClass174 r1, C226715i r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00() {
        Handler A0H = C36341k9.A0H();
        C226715i r2 = this.A01;
        Objects.requireNonNull(r2);
        Message obtain = Message.obtain(A0H, new C1497372o(r2, 18));
        C35091i8.A00(obtain);
        A0H.sendMessageAtFrontOfQueue(obtain);
    }
}
