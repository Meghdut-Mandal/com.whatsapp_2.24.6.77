package X;

import android.os.SystemClock;

/* renamed from: X.8YT  reason: invalid class name */
public final class AnonymousClass8YT extends C226815j {
    public long A00;
    public final /* synthetic */ AnonymousClass8Z0 A01;

    public AnonymousClass8YT(AnonymousClass8Z0 r1) {
        this.A01 = r1;
    }

    public void A04(AnonymousClass11F r7) {
        AnonymousClass8Z0 r5 = this.A01;
        if (AnonymousClass00C.A0J(r7, r5.A0E.A1J.A00) && SystemClock.uptimeMillis() - this.A00 > 2000) {
            this.A00 = SystemClock.uptimeMillis();
            AnonymousClass8Z0.setupNewsletterIcon$default(r5, false, 1, (Object) null);
            AnonymousClass8Z0.A0E(r5);
            AnonymousClass8Z0.A0D(r5);
        }
    }
}
