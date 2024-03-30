package X;

import android.os.ConditionVariable;

/* renamed from: X.1jR  reason: invalid class name and case insensitive filesystem */
public class C35901jR extends C50492l0 {
    public C35901jR(boolean z) {
        AnonymousClass6QB r4 = new AnonymousClass6QB("chatstate");
        AnonymousClass6QB r3 = new AnonymousClass6QB("composing");
        if (z) {
            r3.A04(new AnonymousClass1AL("media", "audio"));
        }
        r4.A05(r3.A03());
        this.A00 = r4.A03();
    }

    public C35901jR(C50582l9 r3) {
        AnonymousClass6QB r1 = new AnonymousClass6QB("query");
        ConditionVariable conditionVariable = C18740tg.A00;
        r1.A06(r3.A00);
        this.A00 = r1.A03();
    }

    public C35901jR() {
        AnonymousClass6QB r2 = new AnonymousClass6QB("chatstate");
        r2.A05(new AnonymousClass6QB("paused").A03());
        this.A00 = r2.A03();
    }
}
