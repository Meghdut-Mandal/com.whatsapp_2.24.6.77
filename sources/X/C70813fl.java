package X;

import java.util.Collection;

/* renamed from: X.3fl  reason: invalid class name and case insensitive filesystem */
public abstract class C70813fl implements AnonymousClass4Q2 {
    public final AnonymousClass4Q2[] A00;

    public boolean B73(AnonymousClass4Q1 r7, Collection collection, int i) {
        AnonymousClass00C.A0D(collection, 1);
        for (AnonymousClass4Q2 r0 : this.A00) {
            if (r0 != null && r0.B73(r7, collection, i)) {
                return true;
            }
        }
        return false;
    }

    public C70813fl(AnonymousClass4Q2... r1) {
        this.A00 = r1;
    }
}
