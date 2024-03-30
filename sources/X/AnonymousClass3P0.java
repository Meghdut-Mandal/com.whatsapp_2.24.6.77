package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3P0  reason: invalid class name */
public final class AnonymousClass3P0 {
    public final C65663Sz A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final Map A05;

    public final boolean A00() {
        if (this.A00 != null || !this.A02.isEmpty() || !this.A03.isEmpty() || !this.A01.isEmpty() || !this.A05.isEmpty() || !this.A04.isEmpty()) {
            return false;
        }
        return true;
    }

    public AnonymousClass3P0(C65663Sz r4, List list, List list2, List list3, Map map, Map map2) {
        this.A00 = r4;
        this.A02 = AnonymousClass4YZ.A00(list, new AnonymousClass4NT(true), 10);
        this.A03 = AnonymousClass4YZ.A00(list2, new AnonymousClass4NT(true), 10);
        this.A01 = AnonymousClass4YZ.A00(list3, new AnonymousClass4NT(false), 10);
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        AnonymousClass00C.A08(unmodifiableMap);
        this.A05 = unmodifiableMap;
        Map unmodifiableMap2 = Collections.unmodifiableMap(map2);
        AnonymousClass00C.A08(unmodifiableMap2);
        this.A04 = unmodifiableMap2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3P0() {
        /*
            r7 = this;
            r1 = 0
            X.09w r2 = X.C023409w.A00
            X.00f r5 = X.C000400e.A0D()
            X.00f r6 = X.C000400e.A0D()
            r0 = r7
            r3 = r2
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3P0.<init>():void");
    }
}
