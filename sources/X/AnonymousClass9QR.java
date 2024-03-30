package X;

import java.io.IOException;

/* renamed from: X.9QR  reason: invalid class name */
public class AnonymousClass9QR {
    public final /* synthetic */ C195979Xa A00;
    public final /* synthetic */ C204369pt A01;

    public AnonymousClass9QR(C195979Xa r1, C204369pt r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(Exception exc) {
        AnonymousClass927 r5;
        C204369pt r3 = this.A01;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = exc.getMessage();
        C204369pt.A0F(r3, "prepareMediaSource onError: %s", A0L);
        if (exc instanceof AnonymousClass82J) {
            r5 = (AnonymousClass927) exc;
        } else if (exc instanceof IOException) {
            r5 = AnonymousClass82J.A00(exc, 0, 2000);
        } else if (exc instanceof RuntimeException) {
            r5 = AnonymousClass82J.A00(exc, 2, 1000);
        } else {
            r5 = null;
        }
        r3.A0O(r5, AnonymousClass902.A0D);
    }
}
