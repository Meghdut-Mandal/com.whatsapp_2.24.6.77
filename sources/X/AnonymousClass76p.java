package X;

import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: X.76p  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76p implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1493370u A02;
    public final /* synthetic */ C1272467n A03;

    public /* synthetic */ AnonymousClass76p(C1493370u r1, C1272467n r2, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object call() {
        int i;
        C1493370u r5 = this.A02;
        C1272467n r4 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        HandlerThread handlerThread = r5.A0B;
        C18740tg.A03(handlerThread);
        r5.A08 = true;
        if (!C1493370u.A09(r5)) {
            i = -6;
        } else {
            boolean A012 = r4.A01(r5.A0E, i2, i3);
            i = -7;
            if (A012) {
                C18740tg.A03(handlerThread);
                r5.A08 = false;
                i = C1493370u.A01(r5);
            }
        }
        return Integer.valueOf(i);
    }
}
