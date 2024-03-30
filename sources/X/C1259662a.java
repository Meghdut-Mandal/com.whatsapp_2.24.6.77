package X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.62a  reason: invalid class name and case insensitive filesystem */
public final class C1259662a {
    public final C159017ie A00;
    public final C160367kt A01;
    public final C117985n9 A02;

    public final void A00(AnonymousClass69R r17, AnonymousClass72B r18, Integer num, String str, long j) {
        AnonymousClass69R r5 = r17;
        AnonymousClass00C.A0D(r5, 5);
        long now = this.A00.now();
        C117985n9 r1 = this.A02;
        r1.A00.A02(new C162977pS(str, 1), new AnonymousClass6S9((Object) new C100554vD(r5, r18, num, now), j * 1000, now), "ASYNC_COMPONENT");
    }

    public C1259662a(C160367kt r2, C117985n9 r3) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        AnonymousClass00C.A08(realtimeSinceBootClock);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = realtimeSinceBootClock;
    }
}
