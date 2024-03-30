package X;

import java.util.HashMap;

/* renamed from: X.66D  reason: invalid class name */
public final class AnonymousClass66D {
    public final C21010yW A00;
    public final HashMap A01 = AnonymousClass001.A0J();

    public AnonymousClass66D(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final String A00(AnonymousClass11F r3) {
        HashMap hashMap = this.A01;
        Object obj = hashMap.get(r3);
        if (obj == null) {
            obj = C90464aC.A0V();
            hashMap.put(r3, obj);
        }
        return (String) obj;
    }

    public final void A01(C108315Ta r5, AnonymousClass11F r6) {
        String A002 = A00(r6);
        C21010yW r3 = this.A00;
        C1038957m r2 = new C1038957m();
        r2.A02 = A002;
        r2.A00 = Long.valueOf(r5.value);
        r2.A01 = r5.name();
        r3.Bly(r2);
    }
}
