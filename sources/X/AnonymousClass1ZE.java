package X;

import java.util.Map;

/* renamed from: X.1ZE  reason: invalid class name */
public final class AnonymousClass1ZE {
    public final Map A00;

    public AnonymousClass1ZE(AnonymousClass1Z7 r5, AnonymousClass1Z8 r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        this.A00 = C000400e.A07(new AnonymousClass011(2, r5), new AnonymousClass011(1, r6));
    }

    public final AnonymousClass1Z6 A00(int i) {
        return (AnonymousClass1Z6) this.A00.get(Integer.valueOf(i));
    }
}
