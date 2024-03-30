package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6O7  reason: invalid class name */
public final class AnonymousClass6O7 {
    public final List A00;
    public final Map A01;
    public final Map A02;
    public final Set A03;

    public final Long A00(C108295Sy r7, AnonymousClass11F r8) {
        long indexOf = (long) ((List) C90494aF.A0Y(r7, this.A01)).indexOf(r8);
        Long valueOf = Long.valueOf(indexOf);
        if (indexOf == -1) {
            return null;
        }
        return valueOf;
    }

    public AnonymousClass6O7(int i, boolean z) {
        this.A01 = C36431kI.A1G();
        this.A02 = C000200c.A01(C36431kI.A1G(), C155697Xb.A00);
        this.A03 = C36441kJ.A17();
        this.A00 = AnonymousClass001.A0I();
        for (C108295Sy put : C108295Sy.values()) {
            this.A01.put(put, AnonymousClass001.A0I());
        }
    }

    public AnonymousClass6O7() {
        this(0, true);
    }
}
